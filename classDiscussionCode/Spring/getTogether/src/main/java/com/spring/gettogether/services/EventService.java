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
	
	// Dependency Injection
	@Autowired
	private EventRepository repo;
	
	public List<Event> getEventsForGuest(Guest guest) {
		return repo.findByGuestsIs(guest);
	}
	
}
	
