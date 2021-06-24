package com.spring.gettogether.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.gettogether.models.Event;
import com.spring.gettogether.models.Guest;
import com.spring.gettogether.models.Rsvp;
import com.spring.gettogether.repositories.RsvpRepository;

@Service
public class RsvpService {
	
	@Autowired
	private RsvpRepository repo;
	
	public List<Rsvp> getAllRsvps() {
		return repo.findAll();
	}
	
	public Rsvp save(Rsvp rsvp) {
		
		return repo.save(rsvp);
		
	}
	
	public List<Rsvp> getRsvpsByEvent(Event event) {
		return repo.findAllByEventIs(event);
	}
	
	public List<Rsvp> getAllRsvpsForGuest(Guest guest) {
		return repo.findAllByGuestIs(guest);
	}
	
	
}
