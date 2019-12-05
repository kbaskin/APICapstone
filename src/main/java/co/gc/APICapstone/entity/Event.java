package co.gc.APICapstone.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

	private String id;
	private String name;
	private String type;
	@JsonProperty("_embedded")
	SecondLayer emb2;
	ArrayList<Classification> classifications;
	Dates dates;
	private String url;

	public Event() {

	}

//	public Event(String name, String type, SecondLayer emb2, ArrayList<Classification> classifications, Dates dates) {
//		super();
//		this.name = name;
//		this.type = type;
//		this.emb2 = emb2;
//		this.classifications = classifications;
//		this.dates = dates;
//	}

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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "id=" + id + "&name=" + name + "&type=" + type + "&emb2=" + emb2 + "&classifications="
				+ classifications + "&dates=" + dates + "&url=" + url;
	}
	

}
