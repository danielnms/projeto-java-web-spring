package com.devsuperior.userdept.entities;

public class User {
	private Long id;
	private String name, email;
	
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
