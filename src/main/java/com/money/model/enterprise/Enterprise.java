package com.money.model.enterprise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.money.model.BasicEntity;

@Entity
@Table(name="ENTERPRISE", indexes={@Index(columnList="name", unique=true)})
public class Enterprise extends BasicEntity {

	private String name;

	
	public Enterprise(){
	}
	
	public Enterprise(String name){
		this.name = name;
	}
	
	@Column(length=255)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
