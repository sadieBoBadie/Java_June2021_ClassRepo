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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="guests")
public class Guest {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	@Size(min=2)
	private String name;
	
	@Column(updatable=false)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date updatedAt;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(
			name="rsvps",
			joinColumns=@JoinColumn(name="guest_id"),
			inverseJoinColumns=@JoinColumn(name="event_id")
		)
	private List<Event> eventsAttending;
	
	public Guest() {
		
	}

	

	
	public Guest(Long id, @NotEmpty @Size(min = 2) String name, Date createdAt, Date updatedAt,
			List<Event> eventsAttending) {
		this.id = id;
		this.name = name;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.eventsAttending = eventsAttending;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public List<Event> getEventsAttending() {
		return eventsAttending;
	}




	public void setEventsAttending(List<Event> eventsAttending) {
		this.eventsAttending = eventsAttending;
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



	@PrePersist
	public void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updatedAt = new Date();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
