package com.mimaraslan.cookies;

import com.mimaraslan.Icecream;

public class Hazelnut extends CookiesDecorator {

	public Hazelnut(Icecream icecream) {
		this.icecream = icecream;
	}

	public String getDescription() {
		return icecream.getDescription() + ", Hazelnut";
	}

	public double cost() {
		return .10 + icecream.cost();
	}
}