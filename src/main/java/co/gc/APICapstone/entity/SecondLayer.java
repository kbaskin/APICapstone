package co.gc.APICapstone.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SecondLayer {

	ArrayList<Venue> venues;

	public SecondLayer() {

	}

	public SecondLayer(ArrayList<Venue> venues) {
		super();
		this.venues = venues;
	}

	public ArrayList<Venue> getVenues() {
		return venues;
	}

	public void setVenues(ArrayList<Venue> venues) {
		this.venues = venues;
	}

	@Override
	public String toString() {
		return "venues=" + venues;
	}

	
	
}
