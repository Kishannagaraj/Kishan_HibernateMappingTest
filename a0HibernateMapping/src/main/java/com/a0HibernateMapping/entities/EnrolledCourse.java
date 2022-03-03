package com.a0HibernateMapping.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="enrolled_course")
public class EnrolledCourse {

	@Id
	private int id 	;
	private int student_id ;
	private int course_id ;
	private String registration_date;
	private String start_date;
	private String end_date ;
	private String status ;
	private String fee;
	
}
