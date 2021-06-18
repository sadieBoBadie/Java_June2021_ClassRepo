package com.sadiespring.postandsession.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sadiespring.postandsession.models.Book;
import com.sadiespring.postandsession.services.BookService;

@RestController
public class MainController {

	@Autowired
	private BookService bookService;
	
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.allBooks();
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable Long id) {
		return bookService.findBook(id);
	}
	
	@PostMapping("/books")
	public Book createBook(
			@RequestParam("title") String title,
			@RequestParam("description")String description,
			@RequestParam("language")String language,
			@RequestParam("numberOfPages") Integer numPages) {
		
		Book newBook = new Book(title, description, language, numPages); 
			
		return bookService.createBook(newBook);
	}
	
	
}
