package co.gc.APICapstone.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Venue {

	private String name;
	private String type;
	private String id;
	private int postalCode;

	public Venue() {

	}

	public Venue(String name, String type, String id, int postalCode) {
		super();
		this.name = name;
		this.type = type;
		this.id = id;
		this.postalCode = postalCode;
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

}
