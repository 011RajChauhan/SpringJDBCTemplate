package com.spring.dao;

import java.util.List;

import com.spring.model.Contact;

public interface ContactDao {
	public List<Contact>listContacts();
	public void saveOrUpdate(int contactId);
	public void delete(int contactId);
	public Contact getContact(int contactId);
}
