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

import com.spring.gettogether.models.Event;
import com.spring.gettogether.models.Guest;
import com.spring.gettogether.models.Rsvp;
import com.spring.gettogether.services.EventService;
import com.spring.gettogether.services.GuestService;
import com.spring.gettogether.services.RsvpService;

@Controller
public class MainController {
	
	@Autowired
	private EventService events;
	
	@Autowired
	private GuestService guests;
	
	@Autowired
	private RsvpService rsvps;
	
	
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
		
		Event event = events.getEventById(id);
		model.addAttribute("event", event);
		model.addAttribute("rsvps", rsvps.getRsvpsByEvent(event));
		
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
			@Valid @ModelAttribute("rsvpObject") Rsvp rsvp,
			BindingResult result,
			Model model
		) {
		System.out.println(rsvp.getGuest());
		System.out.println(rsvp.getEvent());
		
		
		if (result.hasErrors()) {
			// Still need to send available events in
			// and the guest.
			Guest guest = rsvp.getGuest();
			List<Event> openEvents = events.getEventsGuestIsNotAttending(guest);
			
			model.addAttribute("guest", guest);
			model.addAttribute("events", openEvents);
			
			return "guest.jsp";
		}
		
		
		rsvps.save(rsvp);
		
		return String.format("redirect:/guests/%s", rsvp.getGuest().getId());
	}
	
	
}
