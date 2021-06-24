package com.spring.gettogether.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="events")
public class Event {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date eventDate;
	
	@NotEmpty
	private String eventName;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="rsvps",
			joinColumns=@JoinColumn(name="event_id"),
			inverseJoinColumns=@JoinColumn(name="guest_id")
		)
	private List<Guest> attendees;
	
	
	public Event() {
		
	}


	public Event(Long id, @NotNull Date eventDate, @NotEmpty String eventName, Date createdAt, Date updatedAt,
			List<Guest> attendees) {
		this.id = id;
		this.eventDate = eventDate;
		this.eventName = eventName;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.attendees = attendees;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getEventDate() {
		return eventDate;
	}


	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}


	public String getEventName() {
		return eventName;
	}


	public void setEventName(String eventName) {
		this.eventName = eventName;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	public List<Guest> getAttendees() {
		return attendees;
	}


	public void setAttendees(List<Guest> attendees) {
		this.attendees = attendees;
	}
	
	
	
	
}
