package com.mimaraslan.cookies;

import com.mimaraslan.Icecream;

public class Walnut extends CookiesDecorator {

	public Walnut(Icecream icecream) {
		this.icecream = icecream;
	}

	public String getDescription() {
		return icecream.getDescription() + ", Walnut";
	}

	public double cost() {
		return .05 + icecream.cost();
	}
}