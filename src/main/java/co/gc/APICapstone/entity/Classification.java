package co.gc.APICapstone.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Classification {

	private String primary;
	Type segment;

	public Classification() {

	}

	public Classification(String primary, Type segment) {
		super();
		this.primary = primary;
		this.segment = segment;
	}

	public String getPrimary() {
		return primary;
	}

	public void setPrimary(String primary) {
		this.primary = primary;
	}

	public Type getSegment() {
		return segment;
	}

	public void setSegment(Type segment) {
		this.segment = segment;
	}

	@Override
	public String toString() {
		return "primary=" + primary + "&segment=" + segment;
	}
	
	

}
