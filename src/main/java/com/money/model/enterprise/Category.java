package com.money.model.enterprise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import com.money.model.BasicEntity;

@Entity
@Table(name = "CATEGORY", indexes = { @Index(columnList = "name", unique = true) })
public class Category {

	private String name;

	private String descritpion;

	public Category() {
	}

	public Category(String name) {
		this.name = name;
	}

	private Long oid;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Column(length = 255)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length = 4000)
	public String getDescritpion() {
		return descritpion;
	}

	public void setDescritpion(String descritpion) {
		this.descritpion = descritpion;
	}

}
