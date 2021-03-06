package com.mazo.money.model.enterprise;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.mazo.money.model.BasicEntity;

@Entity
@Table(name = "CATEGORY", indexes = { @Index(columnList = "name", unique = true) })
public class Category extends BasicEntity {

	private String name;

	private String description;

	private List<SubCategory> subCategories;

	public Category() {
	}

	public Category(String name) {
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

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	@Cascade(CascadeType.ALL)
	public List<SubCategory> getSubCategories() {
		return subCategories;
	}

	public void setSubCategories(List<SubCategory> subCategories) {
		this.subCategories = subCategories;
	}

}
