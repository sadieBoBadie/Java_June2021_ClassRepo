package com.spring.gettogether.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.gettogether.models.Event;
import com.spring.gettogether.models.Guest;
import com.spring.gettogether.repositories.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository repo;
	
	public List<Event> getEventsByGuest(Guest guest) {
		return repo.findAllByAttendeesIs(guest);
	}
	
	public List<Event> getAllEvents() {
		return repo.findAll();
	}
	
	public Event addEvent(Event event) {
		return repo.save(event);
	}
	
	public List<Event> getEventsGuestIsNotAttending(Guest guest) {
		return repo.findAllByAttendeesNotContains(guest);
	}
	
	public Event getEventById(Long id) {
		Optional<Event> event = repo.findById(id);
		if (event.isPresent()) {
			return event.get();
		};
		return null;
	}
}
	
