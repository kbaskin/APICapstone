package co.gc.APICapstone.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dates {

	DateDetails start;

	public Dates() {

	}

	public DateDetails getStart() {
		return start;
	}

	public void setStart(DateDetails start) {
		this.start = start;
	}

	@Override
	public String toString() {
		return "start=" + start;
	}

	
	
}
