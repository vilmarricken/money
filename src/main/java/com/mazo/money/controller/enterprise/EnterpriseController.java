package com.mazo.money.controller.enterprise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mazo.money.model.enterprise.Payee;
import com.mazo.money.service.enterprise.EnterpriseService;

@RestController
public class EnterpriseController {

	@Autowired
	private EnterpriseService service;

	@RequestMapping(path="enterprise", method=RequestMethod.GET)
	public Payee save(@RequestParam(value = "enterprise", required=true) Payee enterprise) {
		return service.save(enterprise);
	}

	public List<Payee> listAll(){
		return new ArrayList<>();
	}
	

}
