package com.devsuperior.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name, email;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	// Construtor
	public User() {
	}
	
	// Métodos Getters (Acessores)
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public Department getDepartment() {
		return this.department;
	}
	
	// Métodos Setters (Modificadores)
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
}
