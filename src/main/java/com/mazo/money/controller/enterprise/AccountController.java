package com.mazo.money.controller.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mazo.money.model.Account;
import com.mazo.money.service.enterprise.AccountService;

@RestController
@RequestMapping(value = "account")
public class AccountController {

	@Autowired
	private AccountService service;

	@PostMapping
	public Account save(@RequestBody Account account) {
		return service.save(account);
	}

}
