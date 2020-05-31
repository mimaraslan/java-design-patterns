package com.mimaraslan.sauces;

import com.mimaraslan.Icecream;

public class Chocolate extends CondimentDecorator {

	public Chocolate(Icecream icecream) {
		this.icecream = icecream;
	}

	public String getDescription() {
		return icecream.getDescription() + ", Chocolate";
	}

	public double cost() {
		return .83 + icecream.cost();
	}
}