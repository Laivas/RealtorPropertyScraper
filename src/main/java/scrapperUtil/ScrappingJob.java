package scrapperUtil;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

//import scrapper.MarineTrafficSelenium;
import scrapper.RealtorScrapper;
//import scrapperGui.MarineTrafficMainPane;
import scrapperGui.RealtorPropertysMainPane;
import scrapperModel.ScheduledTask;
import scrapperModel.SettingsPaneSelection;
import scrapperXmlModel.ScheduledTasks;

public class ScrappingJob implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub

		System.out.println("Scrapping Job Implementation here");

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub

				XmlReaderWriter xmlReaderWriter = new XmlReaderWriter();

				ScheduledTasks tasks = new ScheduledTasks();
				
				RealtorPropertysMainPane realtorPropertysMainPane = (RealtorPropertysMainPane) context.getMergedJobDataMap().get("scrapperGui.RealtorPropertysMainPane");
				
				RealtorScrapper realtorScrapper = new RealtorScrapper();

				for (ScheduledTask task : xmlReaderWriter.fromXml(tasks, "scheduledTasks.xml").getScheduledTaskList()) {

					if (task.getTaskName().equals(context.getTrigger().getJobKey().getName())
							&& task.getType().equals(context.getTrigger().getJobKey().getGroup())) {
						
						realtorScrapper.setWriteToPath((Paths.get(task.getWriteTo())));
						
						List<String[]> querys = new ArrayList<String[]>();

						for (String[] entry : readEntriesFromCsv(Paths.get(task.getReadFrom()))) {
							
							querys.add(entry);
							
						}
						
						xmlReaderWriter = new XmlReaderWriter();

						SettingsPaneSelection settingsPaneSelection = xmlReaderWriter
								.fromXml(new SettingsPaneSelection(), "settingsPaneSelection.xml");

						if (settingsPaneSelection != null) {

							realtorScrapper.setDelayInMs(Integer.valueOf(settingsPaneSelection.getRequestDelay()));

							if (settingsPaneSelection.isUseProxy()) {

								realtorScrapper.setNumberOfThreads(
										Integer.valueOf(settingsPaneSelection.getNumberOfThreads()));

								CsvReaderWriter CsvReaderWriter = new CsvReaderWriter();

								realtorScrapper.setProxies(CsvReaderWriter
										.readFromCsvByLine(Paths.get(settingsPaneSelection.getLoadProxyFromCsv())));

							}

						}
						
						if (settingsPaneSelection == null) {

							realtorScrapper.setDelayInMs(1000);

						}
						
						for (int i = 0; i < querys.size(); i++) {

							String city = querys.get(i)[0];

							String state = querys.get(i)[1];

							realtorPropertysMainPane.getSearchCityField().setText(city);

							realtorPropertysMainPane.getSearchStateField().setText(state);

							realtorScrapper.query(city, state);

							realtorPropertysMainPane.getRealtorPropertysMainPaneHandler().updateProgress(realtorScrapper);

							realtorScrapper.start();

						}
						
					}

				}

			}

		});
		
		thread.start();

	}

	private List<String[]> readEntriesFromCsv(Path path) {

		CsvReaderWriter csvUtil = new CsvReaderWriter();

		List<String[]> entries = csvUtil.readFromCsvByLine(path);

		return entries;

	}

}
