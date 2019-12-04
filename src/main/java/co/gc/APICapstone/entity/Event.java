package co.gc.APICapstone.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

	private String name;
	private String type;
	@JsonProperty("_embedded")
	SecondLayer emb2;
	ArrayList<Classification> classifications;
	Dates dates;

	public Event() {

	}

	public Event(String name, String type, SecondLayer emb2, ArrayList<Classification> classifications, Dates dates) {
		super();
		this.name = name;
		this.type = type;
		this.emb2 = emb2;
		this.classifications = classifications;
		this.dates = dates;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public SecondLayer getEmb2() {
		return emb2;
	}

	public void setEmb2(SecondLayer emb2) {
		this.emb2 = emb2;
	}

	public ArrayList<Classification> getClassifications() {
		return classifications;
	}

	public void setClassifications(ArrayList<Classification> classifications) {
		this.classifications = classifications;
	}

	public Dates getDates() {
		return dates;
	}

	public void setDates(Dates dates) {
		this.dates = dates;
	}

}
