package com.sadiespring.postandsession.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // listening for requests and ready to render jsp pages

public class MainController {
	
	@RequestMapping("/")
	public String index(HttpSession sesh) {
		
		sesh.setAttribute("count", 0);
		
		return "index.jsp";
	}
	
	@PostMapping("/process_order")
	public String otherRoute(
			@RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName,
			@RequestParam("email") String email,
			@RequestParam("creditCardNumber") String creditCardNumber,
			HttpSession session
			) {
		
		System.out.println("Inside the process method!");
		System.out.printf("Args: %s %s %s %s", firstName, lastName, email, creditCardNumber);
		System.out.println("CHARGING YOUR CREDIT CARD FOR 100$");
		
		session.setAttribute("firstName", firstName);
		session.setAttribute("lastName", lastName);
		
		return "redirect:/resultsPage";
	}
	
	@GetMapping("/resultsPage")
	public String results(Model model, HttpSession sesh) {
		
		model.addAttribute("firstName", sesh.getAttribute("firstName"));
		model.addAttribute("lastName", sesh.getAttribute("lastName"));
		
		return "result.jsp";
	}
 	
}
