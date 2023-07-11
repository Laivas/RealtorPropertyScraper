package scrapperGuiHandlers;

import java.io.File;
import java.nio.file.Paths;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import scrapper.RealtorScrapper;
import scrapperDatabase.SqliteDatabaseConnection;
import scrapperGui.RealtorPropertysMainPane;
import scrapperModel.DataPaneSelection;
import scrapperModel.SettingsPaneSelection;
import scrapperUtil.CsvReaderWriter;
import scrapperUtil.FileNameGenerator;
import scrapperUtil.XmlReaderWriter;

public class RealtorPropertysMainPaneHandler implements EventHandler<ActionEvent> {

	private RealtorPropertysMainPane realtorPropertysMainPane;

	private RealtorScrapper scrapper;

	private Thread thread;

	private XmlReaderWriter xmlReaderWriter;

	public RealtorPropertysMainPaneHandler(RealtorPropertysMainPane realtorPropertysMainPane) {

		this.realtorPropertysMainPane = realtorPropertysMainPane;

	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

		if (event.getSource() == realtorPropertysMainPane.getStartButton()) {

			if (scrapper != null) {

				if (scrapper.isRunning()) {

					scrapper.setRunning(false);

				}

			}

			if (scrapper == null) {

				scrapper = new RealtorScrapper();

			}

			thread = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

					if (scrapper != null) {

						if (scrapper.isRunning() == false) {

							getSelectedSaveDataPath();

							String city = realtorPropertysMainPane.getSearchCityField().getText();

							String state = realtorPropertysMainPane.getSearchStateField().getText();

							xmlReaderWriter = new XmlReaderWriter();

							SettingsPaneSelection settingsPaneSelection = xmlReaderWriter
									.fromXml(new SettingsPaneSelection(), "settingsPaneSelection.xml");

							if (settingsPaneSelection != null) {

								scrapper.setDelayInMs(Integer.valueOf(settingsPaneSelection.getRequestDelay()));

								if (settingsPaneSelection.isUseProxy()) {

									scrapper.setNumberOfThreads(
											Integer.valueOf(settingsPaneSelection.getNumberOfThreads()));

									CsvReaderWriter csvReaderWriter = new CsvReaderWriter();

									scrapper.setProxies(csvReaderWriter
											.readFromCsvByLine(Paths.get(settingsPaneSelection.getLoadProxyFromCsv())));

								}

							}

							if (settingsPaneSelection == null) {

								scrapper.setDelayInMs(1000);

							}

							scrapper.query(city, state);

							updateProgress(scrapper);

							scrapper.start();

						}

						scrapper = null;

					}

				}

			});

			thread.start();

		}

		if (event.getSource() == realtorPropertysMainPane.getStopButton()) {

			if (scrapper != null) {

				if (scrapper.isRunning()) {

					scrapper.stop();

				}

			}

		}

		if (event.getSource() == realtorPropertysMainPane.getPauseResumeButton()) {

			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub

					if (scrapper != null) {

						if (scrapper.isRunning()) {

							if (realtorPropertysMainPane.getPauseResumeButton().getText().equals("Pause")) {

								Platform.runLater(new Runnable() {

									@Override
									public void run() {
										// TODO Auto-generated method stub
										realtorPropertysMainPane.getPauseResumeButton().setText("Resume");

									}

								});

								scrapper.pause();

							}

							if (realtorPropertysMainPane.getPauseResumeButton().getText().equals("Resume")) {

								Platform.runLater(new Runnable() {

									@Override
									public void run() {
										// TODO Auto-generated method stub
										realtorPropertysMainPane.getPauseResumeButton().setText("Pause");
									}

								});

								scrapper.resume();

							}

						}

					}

				}

			});

			thread.start();

		}

	}

	public void getSelectedSaveDataPath() {

		XmlReaderWriter xmlReaderWriter = new XmlReaderWriter();

		DataPaneSelection dataPaneSelection = new DataPaneSelection();

		dataPaneSelection = xmlReaderWriter.fromXml(dataPaneSelection, "dataPaneSelection.xml");

		if (dataPaneSelection.isSaveCsv()) {

			if (dataPaneSelection.isGenerateCsvFileName()) {

				FileNameGenerator fileNameGenerator = new FileNameGenerator();

				scrapper.setWriteToPath(Paths.get(dataPaneSelection.getCsvFolderDir() + File.separator
						+ fileNameGenerator.generateDateFileName() + ".csv"));

			}

			if (dataPaneSelection.isGenerateCsvFileName() == false && dataPaneSelection.getCsvFileName() != null
					&& !dataPaneSelection.getCsvFileName().isEmpty()) {

				scrapper.setWriteToPath(Paths.get(dataPaneSelection.getCsvFolderDir() + File.separator
						+ dataPaneSelection.getCsvFileName() + ".csv"));

			}

		}

		if (dataPaneSelection.isSaveSqliteDb()) {

			if (dataPaneSelection.isGenerateSqliteDbFileName()) {

				FileNameGenerator fileNameGenerator = new FileNameGenerator();

				SqliteDatabaseConnection sqliteDatabaseConnection = new SqliteDatabaseConnection(
						dataPaneSelection.getSqliteFolderDir() + File.separator,
						fileNameGenerator.generateDateFileName() + ".db");

				scrapper.setSqliteDatabaseConnection(sqliteDatabaseConnection);

			}

			if (dataPaneSelection.isGenerateSqliteDbFileName() == false
					&& dataPaneSelection.getSqliteDbFileName() != null
					&& !dataPaneSelection.getSqliteDbFileName().isEmpty()) {

				SqliteDatabaseConnection sqliteDatabaseConnection = new SqliteDatabaseConnection(
						dataPaneSelection.getSqliteFolderDir() + File.separator,
						dataPaneSelection.getSqliteDbFileName() + ".db");

				scrapper.setSqliteDatabaseConnection(sqliteDatabaseConnection);

			}

		}

		if (dataPaneSelection.isSaveSqliteDb() == false && dataPaneSelection.isSaveCsv() == false) {

			FileNameGenerator fileNameGenerator = new FileNameGenerator();

			scrapper.setWriteToPath(Paths.get(System.getProperty("user.home") + File.separator
					+ fileNameGenerator.generateDateFileName() + ".csv"));

		}

	}

	public void updateProgress(RealtorScrapper scrapper) {

		Timer timer = new Timer();

		timer.schedule(new TimerTask() {

			int houseOffersWritten = 0;

			@Override
			public void run() {
				// TODO Auto-generated method stub

				if (scrapper.isRunning() == true) {

					houseOffersWritten = scrapper.getHouseOffersWritten();

					realtorPropertysMainPane.getProgressField().setText("House offers written: " + houseOffersWritten);

				}

				if (scrapper.isRunning() == false) {

					houseOffersWritten = scrapper.getHouseOffersWritten();

					realtorPropertysMainPane.getProgressField().setText("House offers written: " + houseOffersWritten);

					timer.cancel();

				}

			}

		}, 0, 500);

	}

}
