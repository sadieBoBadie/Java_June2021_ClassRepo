package com.spring.gettogether.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.gettogether.models.Event;
import com.spring.gettogether.models.Guest;
import com.spring.gettogether.models.Rsvp;

@Repository
public interface RsvpRepository extends CrudRepository<Rsvp, Long> {
	
	public List<Rsvp> findAll();
	public List<Rsvp> findAllByGuestIs(Guest guest);
	public List<Rsvp> findAllByEventIs(Event event);
	
}
