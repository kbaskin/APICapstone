package co.gc.APICapstone.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//@Entity
//@Table (name="saved_events")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventResults {
	
	
	@JsonProperty("_embedded")
	FirstLayer emb;

	public EventResults() {
	
	}

	public EventResults(FirstLayer emb) {
		super();
		this.emb = emb;
	}

	public FirstLayer getEmb() {
		return emb;
	}

	public void setEmb(FirstLayer emb) {
		this.emb = emb;
	}

	@Override
	public String toString() {
		return "emb=" + emb;
	}
	
	
	
	
}
