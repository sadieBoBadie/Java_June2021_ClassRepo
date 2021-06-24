package com.spring.gettogether.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.gettogether.models.Event;
import com.spring.gettogether.models.Guest;


@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {

	List<Guest> findAllByEventsAttendingIs(Event event);
	List<Guest> findAll();
}
