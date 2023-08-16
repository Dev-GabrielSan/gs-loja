package com.example.gs_store.dto;

import java.io.Serializable;

import com.example.gs_store.entities.Category;

public class CategoryDto implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String nome;
	
	
	public CategoryDto(){
		
	}
	
	
	public CategoryDto(Category entity) {
		this.id = entity.getId();
		this.nome = entity.getName();
	}
	

	public CategoryDto(Long id, String nome) {
	
		this.id = id;
		this.nome = nome;
	}




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
