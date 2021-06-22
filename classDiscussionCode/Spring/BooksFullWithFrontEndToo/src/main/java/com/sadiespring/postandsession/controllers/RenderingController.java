package com.sadiespring.postandsession.controllers;

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
import org.springframework.web.bind.annotation.PutMapping;

import com.sadiespring.postandsession.models.Book;
import com.sadiespring.postandsession.models.Review;
import com.sadiespring.postandsession.services.BookService;
import com.sadiespring.postandsession.services.ReviewService;

@Controller
public class RenderingController {
	
	private final BookService bookService;
	
	@Autowired
	private ReviewService reviewService;
	
	public RenderingController(BookService service) {
		// Dependency Injection 
		this.bookService = service;
	}
	
	@GetMapping("/")
	public String index() {
		return "redirect:/books";
	}
	

	
	@GetMapping("/books")
	public String getAllBooks(
			@ModelAttribute("bookObject") Book emptyBook,
			Model model) {
		// show all books?
		List<Book> allBooks = bookService.allBooks();
		model.addAttribute("allBooks", allBooks);
		
		return "index.jsp";
	}
	
	
	@GetMapping("/books/{id}/edit")
	public String editPage(
			@PathVariable Long id,
			Model model
			) {
		
			// Get the book out of the database
			Book book = bookService.findBook(id);
			// add it to the jsp model thing
			model.addAttribute("bookObject", book);
		
		return "editBook.jsp";
	}
	
	@PutMapping("/books/{id}")
	public String updateBook(
			@PathVariable("id") Long id,
			@Valid @ModelAttribute("bookObject") Book book, BindingResult result
			) {
		
		if (result.hasErrors()) {
			// 
            return "edit.jsp";
        }
        bookService.updateBook(book);
        return "redirect:/books";
	}
	
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable Long id) {
		return bookService.findBook(id);
	}
	
	@PostMapping("/books")
	public String createBook(
			@Valid @ModelAttribute("bookObject") Book filledBookObject,
			BindingResult result) {
		
		// IF ERRORS -- KICK THEM BACK TO THE FORM PAGE
		if (result.hasErrors()){
			return "index.jsp";
		}
		
		// 
		bookService.createBook(filledBookObject); 
			
		return "redirect:/books";
	}
	
	@GetMapping("/reviews/new")
	public String createReviewPage(
			@ModelAttribute("reviewObject") Review emptyReview,
			Model model) {
		// show all books?
		List<Book> allBooks = bookService.allBooks();
		model.addAttribute("allBooks", allBooks);
		
		return "createReview.jsp";
	}
	
	@PostMapping("/reviews")
	public String createReview(
			@Valid @ModelAttribute("reviewObject") Review filledReviewObject,
			BindingResult result) {
		System.out.println(filledReviewObject);
		System.out.println("inside create review process (POST)");
		
		// IF ERRORS -- KICK THEM BACK TO THE FORM PAGE
		if (result.hasErrors()){
			return "createReview.jsp";
		}
		
		// 
		reviewService.create(filledReviewObject);
			
		return "redirect:/books";
	}
	
	@GetMapping("/books/{id}/show")
	public String showBook(@PathVariable Long id, Model model) {
		
		Book book = bookService.findBook(id);
		List<Review> reviews = reviewService.getReviewsByBook(book);
		model.addAttribute("reviews", reviews);
		
		return "showBook.jsp";
	}
	
	
	
}
