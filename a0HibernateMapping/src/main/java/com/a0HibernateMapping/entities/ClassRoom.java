package com.a0HibernateMapping.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="class_room")
public class ClassRoom {

	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn(name="instructor_id")
	private Instructor  instructor;
	@Column
	private String title;
	@Column
	private String start_time;
	@Column
	private String end_time;
	@Column
	private String url;
	@Column
	private String training_day;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTraining_day() {
		return training_day;
	}
	public void setTraining_day(String training_day) {
		this.training_day = training_day;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	@Override
	public String toString() {
		return "ClassRoom [id=" + id + ", title=" + title + ", start_time=" + start_time + ", end_time=" + end_time
				+ ", url=" + url + ", training_day=" + training_day + "]";
	}
	
	
	
}
