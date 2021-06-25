package com.sadiespring.loginreg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.sadiespring.loginreg.models.Book;
import com.sadiespring.loginreg.repositories.BookRepository;

@Service
public class BookService {
	
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	// C R U D
	
	// returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // creates a book
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }
    
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // Update
    public Book updateBook(Book book) {
    	return bookRepository.save(book);
    }
    
    // Delete
    public void deleteBookById(Long id) {
    	bookRepository.deleteById(id);
    }
}
