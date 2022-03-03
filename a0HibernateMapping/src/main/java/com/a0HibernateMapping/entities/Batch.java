package com.a0HibernateMapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="batch")
public class Batch {
	
	@Id
	private int id;
	private String title;
	private int course_id;
	private String start_date;
	private String end_date;
	private String status ;
}
