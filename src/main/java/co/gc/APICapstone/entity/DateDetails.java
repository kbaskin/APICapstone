package co.gc.APICapstone.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DateDetails {

	private String localDate;
	private String dateTime;

	public DateDetails() {

	}

	public DateDetails(String localDate, String dateTime) {
		super();
		this.localDate = localDate;
		this.dateTime = dateTime;
	}

	public DateDetails(String localDate) {
		super();
		this.localDate = localDate;
	}

	public String getLocalDate() {
		return localDate;
	}

	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
