package com.mazo.money.model.enterprise;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.mazo.money.model.BasicEntity;

@Entity
@Table(name="PAYEE", indexes={@Index(columnList="name", unique=true)})
public class Payee extends BasicEntity {

	private String name;

	
	public Payee(){
	}
	
	public Payee(String name){
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
