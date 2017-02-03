package com.mazo.money.service.enterprise;

import java.util.UUID;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mazo.money.model.enterprise.Payee;

public interface EnterpriseService extends PagingAndSortingRepository<Payee, UUID> {
	
	public Payee findByName(String name);
	
}