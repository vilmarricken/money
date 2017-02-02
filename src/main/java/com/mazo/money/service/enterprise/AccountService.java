package com.mazo.money.service.enterprise;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.mazo.money.model.Account;

public class AccountService {

	@PersistenceContext
	private EntityManager manager;

	public Account save(Account account) {
		manager.persist(account);
		return account;
	}

}
