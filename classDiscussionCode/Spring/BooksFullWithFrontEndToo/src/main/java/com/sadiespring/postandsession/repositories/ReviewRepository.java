package com.sadiespring.postandsession.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sadiespring.postandsession.models.Book;
import com.sadiespring.postandsession.models.Review;


@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
	
	List<Review> findByBookIs(Book book);
	
}
