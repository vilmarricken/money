package com.money.controller.enterprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.money.model.enterprise.Category;
import com.money.service.enterprise.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService service;

	@RequestMapping(value = "category", produces = { "application/json" }, method = RequestMethod.GET)
	@ResponseBody
	public Category save(@RequestParam(value = "category", required = true) Category category) {
		return service.save(category);
	}

	@RequestMapping(value = "inverter", produces = { "application/json" }, method = RequestMethod.GET)
	@ResponseBody
	public String inverter(@RequestParam(value = "text", required = true) String text) {
		char[] cs = text.toCharArray();
		int end = cs.length / 2;
		int last = cs.length - 1;
		for (int i = 0; i < end; i++) {
			char t = cs[i];
			int x = last - i;
			cs[i] = cs[x];
			cs[x] = t;
		}
		return new String(cs);
	}
	
	@RequestMapping(value = "sum", produces = { "application/json" }, method = RequestMethod.GET)
	@ResponseBody
	public int sum(@RequestParam(value = "values", required = true) Operation operation) {
		return operation.getA() + operation.getB();
	}
	/*
	 * public List<Enterprise> listAll(){ return new ArrayList<>(); }
	 */

}
