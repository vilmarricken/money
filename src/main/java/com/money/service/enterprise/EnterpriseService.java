package com.money.service.enterprise;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.money.model.enterprise.Enterprise;

public interface EnterpriseService extends PagingAndSortingRepository<Enterprise, UUID> {
	
	public Enterprise findByName(String name);
	
}