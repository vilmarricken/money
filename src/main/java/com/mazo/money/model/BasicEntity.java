package com.mazo.money.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BasicEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long oid;

	public Long getOid() {
		return oid;
	}
	
	public void setOid(Long oid) {
		this.oid = oid;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !obj.getClass().equals(getClass())) {
			return false;
		}
		return this.oid == null || this.oid.equals(((BasicEntity) obj).oid);
	}

	@Override
	public int hashCode() {
		if (oid != null) {
			return oid.hashCode();
		}
		return super.hashCode();
	}

}