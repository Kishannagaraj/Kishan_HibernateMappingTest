package com.a0HibernateMapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="course_content")
public class CourseContent {
	
	@Id
	private int id ;
	private int course ;
	private String Phase;
	private String module 	;
	private String title ;
	private String title_description ;
	private String sub_title; 
	private String sub_title_description;
	private String expected_session;
}
