package scrapperModel;

import java.lang.reflect.Field;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.*;

@Setter
@Getter
@Entity
@Table(name = "realtorDotComProperty")
public class RealtorDotComProperty {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	public Long id;
	
	public String brokeredBy;
	
	public String status;
	
	public String address;
	
	public String secondaryAddress;
	
	public String beds;
	
	public String baths;
	
	public String sqft;
	
	public String sqftLot;
	
	public String price;
	
	
	public String[] fieldsValuesToArray() {

		String[] fields = new String[this.getClass().getDeclaredFields().length];

		int index = 0;

		for (Field field : Arrays.asList(this.getClass().getDeclaredFields())) {

			try {

				if (!field.getName().matches("id")) {

					if (field.get(this) != null) {

						if (field.get(this).toString().contains(":")) {

							fields[index] = field.get(this).toString();

						} else

							fields[index] = field.get(this).toString();

					} 
					
				}

			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			index++;

		}

		return Arrays.copyOfRange(fields, 1, fields.length);

	}
	

}
