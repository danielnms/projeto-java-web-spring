package com.devsuperior.userdept.entities;

public class Department {
	private Long id;
	private String name;
	
	// Construtor
	public Department() {
	}
	
	// Métodos Getters (Acessores)
	public Long getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	// Métodos Setters (Modificadores)
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}
