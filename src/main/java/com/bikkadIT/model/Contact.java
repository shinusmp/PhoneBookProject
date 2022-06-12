package com.bikkadIT.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer contact_id;
	
	private String contact_Name;
	
	private String email_id;
	
	private String contact_number;
	
	@CreationTimestamp
	private Date created_Date;
	@UpdateTimestamp
	private Date updated_date;
	
	
	public Integer getContact_id() {
		return contact_id;
	}
	public void setContact_id(Integer contact_id) {
		this.contact_id = contact_id;
	}
	public String getContact_Name() {
		return contact_Name;
	}
	public void setContact_Name(String contact_Name) {
		this.contact_Name = contact_Name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public Date getCreated_Date() {
		return created_Date;
	}
	public void setCreated_Date(Date created_Date) {
		this.created_Date = created_Date;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	
	
	
	
	
	
	

}
