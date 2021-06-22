package com.spring.gettogether.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.gettogether.models.Event;
import com.spring.gettogether.models.Guest;


@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
	
	List<Event> findAll();
	
	// all the events that a particular guest is attending.
	List<Event> findByGuestsIs(Guest guest);
	
	// get all the events that a guest is NOT attending.
	
	
	
}
