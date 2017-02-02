package com.mazo.money.service.enterprise;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mazo.money.model.enterprise.Category;

public interface CategoryService extends PagingAndSortingRepository<Category, UUID> {
	
	public Category findByName(String name);
	
}