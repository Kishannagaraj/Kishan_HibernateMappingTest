package com.a0HibernateMapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name ="user")
public class User {

	@Id
	private int id;	
	private String name;
	private String username;
	private String mobile;
	private String email;
	private String role;
	private String password;
	private String gender;
	private String address;
	private String is_active;
	private String created_at;
	private String updated_at;
	private String dob;
}
