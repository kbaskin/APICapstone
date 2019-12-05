package co.gc.APICapstone.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FirstLayer {
	
	ArrayList <Event> events;

	public FirstLayer() {
	
	}

	public FirstLayer(ArrayList<Event> events) {
		super();
		this.events = events;
	}

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	@Override
	public String toString() {
		return "events=" + events;
	}
	
	

}
