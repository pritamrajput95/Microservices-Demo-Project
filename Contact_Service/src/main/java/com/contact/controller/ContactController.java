package com.contact.controller;

import java.util.List;

import com.contact.entity.Contact;

public interface ContactController {

	public List<Contact> getContacts(Long userId);
}
