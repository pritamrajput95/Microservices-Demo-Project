package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	//fake data 
	 List<Contact> list= List.of(
			 
			 new Contact(10L, "pritamrajput1906@gmail.com","Pritam", 1001L),
			 new Contact(11L, "rakeshrajput@gmail.com","Rakesh", 1002L),
			 new Contact(12L, "durgeshmalakar@gmail.com","Durgesh", 1001L),
			 new Contact(13L, "pritam.rajput@sysnik.com","Pritam", 1003L),
			 new Contact(14L, "vinodyadav@gmail.com","Vinod", 1002L)
			 );
	
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		
		return this.list.stream().filter(contact->contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
