package com.example.gs_store.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gs_store.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}