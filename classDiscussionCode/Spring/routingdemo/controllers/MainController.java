package com.sadiespring.routingdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/boxes/{color}")
	
	public String index(@PathVariable("color") String color, Model model) {
		
		System.out.printf("Color is: %s", color);
		model.addAttribute("color", color);
		
		return "index.jsp";
	}
	
	
	@RequestMapping("/boxes/{color}/{number}")
	public String puppies(@PathVariable("color") String color, @PathVariable("number") Integer number) {
		
		System.out.println(number);
		
		return String.format("Hello to the number: %s", number);
	}
	
	@GetMapping("/searchPage")
	public String search() {
		
		
		return "search.jsp";
	}
	
	@PostMapping("/search")
	public String submitSearch(
			@RequestParam("searchTerms") String searchTerms,
			Model model
			) {
		
		String[] foods = {"hotdog", "pancake", "hamburger"};
		
		model.addAttribute(
				"query", searchTerms
				);
		model.addAttribute(
				"foods", foods
				);
		
		
		
		return "results.jsp";
	}
 	
}
