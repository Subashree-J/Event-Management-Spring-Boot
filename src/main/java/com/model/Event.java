package com.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="event")
public class Event {
	
	@Id
	@GeneratedValue
	private int eventId;
	
	private String eventName;
	
	private String organiserName;
	
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate eventDate;
	
	private String location;
	
	private String organiserEmail;

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getOrganiserName() {
		return organiserName;
	}

	public void setOrganiserName(String organiserName) {
		this.organiserName = organiserName;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getOrganiserEmail() {
		return organiserEmail;
	}

	public void setOrganiserEmail(String organiserEmail) {
		this.organiserEmail = organiserEmail;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eventDate, eventId, eventName, location, organiserEmail, organiserName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		return Objects.equals(eventDate, other.eventDate) && Objects.equals(eventId, other.eventId)
				&& Objects.equals(eventName, other.eventName)
				&& Objects.equals(location, other.location) && Objects.equals(organiserEmail, other.organiserEmail)
				&& Objects.equals(organiserName, other.organiserName);
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", organiserName=" + organiserName
				+ ", eventDate=" + eventDate + ", location=" + location + ", organiserEmail="
				+ organiserEmail + "]";
	}
	
	
	
}
