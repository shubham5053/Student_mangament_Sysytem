 package com.cafe.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class user implements Serializable {
    
	 private static final long serialVersionUID =1l;
	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="id")
	 private Integer id;
	 @Column(name="name")
	 private String name;
	 @Column(name="contactNumber")
	 private String contactNumber;
	 @Column(name="email")
	 private String email;
	public user(String name, String contactNumber, String email) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.email = email;
		
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "user [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", email=" + email
				+  "]";
	}
	
	 
}
