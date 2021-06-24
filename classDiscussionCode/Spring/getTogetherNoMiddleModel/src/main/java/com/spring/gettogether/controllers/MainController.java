package com.spring.gettogether.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.gettogether.models.Event;
import com.spring.gettogether.models.Guest;
import com.spring.gettogether.services.EventService;
import com.spring.gettogether.services.GuestService;
import com.spring.gettogether.services.Rsvp;

@Controller
public class MainController {
	
	@Autowired
	private EventService events;
	
	@Autowired
	private GuestService guests;
	
	
	@GetMapping("/")
	public String home(
			@ModelAttribute("guestObject") Guest guest,
			@ModelAttribute("eventObject") Event event,
			Model model
		) {
		
		model.addAttribute("allEvents", events.getAllEvents());
		model.addAttribute("allGuests", guests.getAllGuests());
		
		return "dashboard.jsp";
	}
	
	@GetMapping("/guests/{id}")
	public String guestPage(
			Model model,
			@PathVariable("id") Long id,
			@ModelAttribute("rsvpObject") Rsvp rsvp
			
		){
		Guest guest = guests.getGuestById(id);
		List<Event> openEvents = events.getEventsGuestIsNotAttending(guest);
		
		model.addAttribute("guest", guest);
		model.addAttribute("events", openEvents);
		
		return "guest.jsp";
	}
	
	@GetMapping("/events/{id}")
	public String eventPage(
			Model model,
			@PathVariable("id") Long id
			){
		return "event.jsp";
	}
	
	@PostMapping("/guests")
	public String createGuest(
			@Valid @ModelAttribute("guestObject") Guest guest,
			BindingResult result,
			Model model
			) {
		if (result.hasErrors()) {
			model.addAttribute("allEvents", events.getAllEvents());
			model.addAttribute("allGuests", guests.getAllGuests());
			return "redirect:/";
		}
		
		guests.addGuest(guest);
		
		return "redirect:/";
	}
	
	@PostMapping("/events")
	public String createEvent(
			@Valid @ModelAttribute("eventObject") Event event,
			BindingResult result,
			Model model
			) {
		if (result.hasErrors()) {
			model.addAttribute("allEvents", events.getAllEvents());
			model.addAttribute("allGuests", guests.getAllGuests());
			return "redirect:/";
		}
		
		events.addEvent(event);
		
		return "redirect:/";
	}
	
	@PostMapping("/rsvp")
	public String addGuestToEvent(
			@RequestParam("guestId") Long guestId,
			@RequestParam("eventId") Long eventId
		) {
		
		Guest guest = guests.getGuestById(guestId);
		Event event = events.getEventById(eventId);
		
		guest.getEventsAttending().add(event);
		guests.addGuest(guest);
		
		return String.format("redirect:/guests/%s", guestId);
	}
	
	
}
