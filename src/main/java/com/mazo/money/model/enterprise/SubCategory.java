package com.mazo.money.model.enterprise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.mazo.money.model.BasicEntity;

@Entity
@Table(name = "CATEGORY", indexes = { @Index(columnList = "name", unique = true) })
public class SubCategory extends BasicEntity {

	private String name;

	private String description;

	public SubCategory() {
	}

	public SubCategory(String name) {
		this.name = name;
	}

	@Column(length = 255)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length = 4000)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
