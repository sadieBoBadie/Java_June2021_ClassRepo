package com.spring.gettogether.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.gettogether.models.Event;
import com.spring.gettogether.models.Guest;

@Repository
public interface EventRepository extends CrudRepository<Event, Long> {
	
	List<Event> findAllByAttendeesIs(Guest guest);
	List<Event> findAll();
	List<Event> findAllByAttendeesNotContains(Guest guest);
	
}
