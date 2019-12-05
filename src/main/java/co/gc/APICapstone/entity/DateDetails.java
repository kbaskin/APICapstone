package co.gc.APICapstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class DateDetails {

	@Column (name="eventDate")
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

	@Override
	public String toString() {
		return "localDate=" + localDate + "&dateTime=" + dateTime;
	}
	
	

}
