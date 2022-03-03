package com.a0HibernateMapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="md_module")
public class MdModule 
{
	@Id
	private String title; 
	private int course_id;
	private int is_active;
	private String trainner_fee;
	
}
