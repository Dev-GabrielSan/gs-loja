package com.example.gs_store.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.gs_store.dto.CategoryDto;
import com.example.gs_store.entities.Category;
import com.example.gs_store.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	@Transactional(readOnly = true)
	public List<CategoryDto> findAll(){
		
		List<Category> list = repository.findAll();
		
		List<CategoryDto> listDto = new ArrayList<>();
		
		for(Category cat : list) {
			listDto.add(new CategoryDto(cat));
		}
		
		return listDto;
		
	}
	
}
