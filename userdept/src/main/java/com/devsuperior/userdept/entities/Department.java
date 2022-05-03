package com.devsuperior.userdept.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
