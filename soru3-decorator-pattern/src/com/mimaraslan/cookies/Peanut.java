package com.mimaraslan.cookies;

import com.mimaraslan.Icecream;

public class Peanut extends CookiesDecorator {

	public Peanut(Icecream icecream) {
		this.icecream = icecream;
	}

	public String getDescription() {
		return icecream.getDescription() + ", Peanut";
	}

	public double cost() {
		return .12 + icecream.cost();
	}
}