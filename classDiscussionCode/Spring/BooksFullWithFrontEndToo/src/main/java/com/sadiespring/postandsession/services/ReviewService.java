package com.sadiespring.postandsession.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sadiespring.postandsession.models.Book;
import com.sadiespring.postandsession.models.Review;
import com.sadiespring.postandsession.repositories.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepo;

	public Review create(Review review) {
		//
		return reviewRepo.save(review);
	}
	
	public List<Review> getReviewsByBook(Book book) {
		return reviewRepo.findByBookIs(book);
	}
	
}
