package com.a0HibernateMapping.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name="instructor")
public class Instructor 
{
	@Id
	private int id ;
	@Column
	private int user_id ;
	@Column
	private String current_company;
	@Column
	private String total_experience;
	@Column
	private String bio;
	@Column
	private String expertise; 
	@Column
	private int status;
	@Column
	private String updated_at;
	
	@OneToMany(mappedBy ="instructor")
	private List<ClassRoom> classRoom;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getCurrent_company() {
		return current_company;
	}

	public void setCurrent_company(String current_company) {
		this.current_company = current_company;
	}

	public String getTotal_experience() {
		return total_experience;
	}

	public void setTotal_experience(String total_experience) {
		this.total_experience = total_experience;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", user_id=" + user_id + ", current_company=" + current_company
				+ ", total_experience=" + total_experience + ", bio=" + bio + ", expertise=" + expertise + ", status="
				+ status + ", updated_at=" + updated_at + ", classRoom=" + classRoom + "]";
	}

	
	
}
