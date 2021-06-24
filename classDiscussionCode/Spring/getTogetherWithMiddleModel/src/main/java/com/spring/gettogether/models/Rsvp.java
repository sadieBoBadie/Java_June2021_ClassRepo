package com.spring.gettogether.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="rsvps")
public class Rsvp {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="guest_id")
	private Guest guest;
	

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="event_id")
	private Event event;
	
	@NotEmpty
	private String mealChoice;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	public Rsvp() {
		
	}

	public Rsvp(Long id, Guest guest, Event event, @NotEmpty String mealChoice, Date createdAt, Date updatedAt) {
		this.id = id;
		this.guest = guest;
		this.event = event;
		this.mealChoice = mealChoice;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String getMealChoice() {
		return mealChoice;
	}

	public void setMealChoice(String mealChoice) {
		this.mealChoice = mealChoice;
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
	
	
	
}
