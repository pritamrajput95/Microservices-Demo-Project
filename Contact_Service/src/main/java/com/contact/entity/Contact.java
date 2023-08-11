package com.contact.entity;

public class Contact {
 
	private Long contactId;
	private String Email;
	private String contactName;
	private Long userId;
	
	
	
	public Contact(Long contactId, String email, String contactName, Long userId) {
		super();
		this.contactId = contactId;
		Email = email;
		this.contactName = contactName;
		this.userId = userId;
	}



	public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
	
}
