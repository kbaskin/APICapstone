package co.gc.APICapstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "saved_events")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BucketList {

	@Id
	private String id;
	@Column(name = "event")
	private String name;
//	@Column (name="eventType")
//	private String name;
	@Column(name = "eventDate")
	private String localDate;

//	public BucketList(String event, String eventType, String localDate) {
//		super();
//		this.event = event;
//		this.name = name;
//		this.localDate = localDate;
//	}
//	
//	public BucketList(String id, String event, String eventType, String localDate) {
//		super();
//		this.id = id;
//		this.event = event;
//		this.name = name;
//		this.localDate = localDate;
//	}

	public BucketList() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// public String getEventType() {
//		return eventType;
//	}
//	public void setEventType(String eventType) {
//		this.eventType = eventType;
//	}
	public String getLocalDate() {
		return localDate;
	}

	public void setLocalDate(String localDate) {
		this.localDate = localDate;
	}

	@Override
	public String toString() {
		return "id=" + id + "&name=" + name + "&localDate=" + localDate;
	}
	
	

}
