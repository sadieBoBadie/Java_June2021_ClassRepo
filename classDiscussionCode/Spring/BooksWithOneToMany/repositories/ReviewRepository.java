package com.sadiespring.postandsession.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sadiespring.postandsession.models.Review;


@Repository
public interface ReviewRepository extends CrudRepository<Review, Long> {
	
}
