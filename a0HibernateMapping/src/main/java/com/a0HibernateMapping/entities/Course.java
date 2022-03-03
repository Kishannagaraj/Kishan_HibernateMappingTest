package com.a0HibernateMapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="course")
public class Course {
	
	@Id
	private int id;
	private int title;
	private String sub_title;
	private int status;
	private double fee ;
	private int discount;
	private String created_at; 
	private String update_at;
}
