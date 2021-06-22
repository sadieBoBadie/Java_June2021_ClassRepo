package com.spring.gettogether.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.gettogether.models.Event;
import com.spring.gettogether.models.Guest;
import com.spring.gettogether.services.EventService;
import com.spring.gettogether.services.GuestService;

@Controller
public class MainController {
	
	@Autowired
	private EventService events;
	
	@Autowired
	private GuestService guests;
	
	
	@GetMapping("/")
	public String home(
		) {

		
		return "dashboard.jsp";
	}
	
	@GetMapping("/guests/{id}")
	public String guestPage(
			Model model,
			@PathVariable("id") Long id
		){
		
		Guest guest = guests.getGuestById(id);
		List<Event> eventsAttending = events.getEventsForGuest(guest);
		
		
		return "guest.jsp";
	}
	
	@GetMapping("/events/{id}")
	public String eventPage(
			){
		return "event.jsp";
	}
	
	@PostMapping("/guests")
	public String createGuest(
			) {
		
		return "redirect:/";
	}
	
	@PostMapping("/events")
	public String createEvent(
			) {
		
		return "redirect:/";
	}
	
	@PostMapping("/rsvp")
	public String addGuestToEvent(
		) {
		
		return "redirect:/";
	}
	
	
}
