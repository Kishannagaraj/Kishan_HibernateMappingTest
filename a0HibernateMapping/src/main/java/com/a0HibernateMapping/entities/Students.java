package com.a0HibernateMapping.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Students 
{

	@Id
	@Column
	private int id;
	@Column
	private int user_id;
	@Column
	private String father_name;
	@Column
	private String refered_by;
	@Column
	private String company;
	@Column
	private String created_at;
	@Column
	private String updated_at;
	@Column
	private String status;
	
	
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


	public String getFather_name() {
		return father_name;
	}


	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}


	public String getRefered_by() {
		return refered_by;
	}


	public void setRefered_by(String refered_by) {
		this.refered_by = refered_by;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getCreated_at() {
		return created_at;
	}


	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}


	public String getUpdated_at() {
		return updated_at;
	}


	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Students [id=" + id + ", user_id=" + user_id + ", father_name=" + father_name + ", refered_by="
				+ refered_by + ", company=" + company + ", created_at=" + created_at + ", updated_at=" + updated_at
				+ ", status=" + status + "]";
	}
	
	
	
}
