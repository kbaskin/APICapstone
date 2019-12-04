package co.gc.APICapstone.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DateDetails {

	private LocalDate localDate;

	public DateDetails() {

	}

	public DateDetails(LocalDate localDate) {
		super();
		this.localDate = localDate;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

}
