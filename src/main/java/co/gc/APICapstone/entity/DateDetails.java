package co.gc.APICapstone.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DateDetails {

	private LocalDate localDate;
	private String dateTime;

	public DateDetails() {

	}

	public DateDetails(LocalDate localDate, String dateTime) {
		super();
		this.localDate = localDate;
		this.dateTime = dateTime;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
