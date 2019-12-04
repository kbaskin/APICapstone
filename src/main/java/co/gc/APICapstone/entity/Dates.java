package co.gc.APICapstone.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dates {

	ArrayList<DateDetails> start;

	public Dates() {

	}

	public Dates(ArrayList<DateDetails> start) {
		super();
		this.start = start;
	}

	public ArrayList<DateDetails> getStart() {
		return start;
	}

	public void setStart(ArrayList<DateDetails> start) {
		this.start = start;
	}

}
