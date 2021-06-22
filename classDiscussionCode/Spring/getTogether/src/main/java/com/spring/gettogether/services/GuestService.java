package com.spring.gettogether.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.gettogether.models.Event;
import com.spring.gettogether.models.Guest;
import com.spring.gettogether.repositories.GuestRepository;

@Service
public class GuestService {
	
	@Autowired
	private GuestRepository repo;
	
	public Guest getGuestById(Long id) {
		
		Optional<Guest> guest = repo.findById(id);
		
		if (guest.isPresent()) {
			return guest.get();
		}
		
		return null;
	}
}
