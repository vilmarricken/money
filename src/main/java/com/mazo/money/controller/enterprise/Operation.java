package com.mazo.money.controller.enterprise;

import java.io.Serializable;

public class Operation implements Serializable {

	private int a;

	private int b;

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

}
