package com.mazo.money.controller.enterprise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mazo.money.model.enterprise.Category;
import com.mazo.money.service.enterprise.CategoryService;

@RestController
@RequestMapping(value = "category")
public class CategoryController {

	@Autowired
	private CategoryService service;

	@PostMapping
	public Category save(@RequestBody Category category) {
		return service.save(category);
	}

	@GetMapping
	public String inverter(@RequestParam(name = "text") String text) {
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

	@PutMapping
	@ResponseBody
	public int sum(@RequestBody Operation operation) {
		return operation.getA() + operation.getB();
	}

	@PatchMapping
	public List<Category> listAll() {
		Iterable<Category> i = service.findAll();
		List<Category> cats = new ArrayList<>();
		for (Category category : i) {
			cats.add(category);
		}
		return cats;
	}

}
