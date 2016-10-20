package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.model.Contact;

public class ContactDaoImpl implements ContactDao{

	private JdbcTemplate jdbcTemplate;
	
	public ContactDaoImpl(DataSource dataSource){
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Contact> listContacts() {
		
		List<Contact>contactList = null;
		String lstCntct = "SELECT * FROM contact";
		contactList = jdbcTemplate.query(lstCntct, new RowMapper<Contact>(){
			
			@Override
			public Contact mapRow(ResultSet resultSet,int rowNo)throws SQLException{
				Contact contact = new Contact();
				contact.setId(resultSet.getInt("in_contact_id"));
				contact.setName(resultSet.getString("vc_name"));
				contact.setAddress(resultSet.getString("vc_address"));
				contact.setContactNo(resultSet.getString("vc_telephone"));
				return contact;
			}
		});
		return contactList;
	}

	@Override
	public void saveOrUpdate(int contactId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int contactId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contact getContact(int contactId) {
		// TODO Auto-generated method stub
		return null;
	}

}
