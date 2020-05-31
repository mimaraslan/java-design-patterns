package com.mimaraslan.sauces;

import com.mimaraslan.Icecream;

public class Blackberry extends CondimentDecorator {

	public Blackberry(Icecream icecream) {
		this.icecream = icecream;
	}

	public String getDescription() {
		return icecream.getDescription() + ", Blackberry";
	}

	public double cost() {
		return .10 + icecream.cost();
	}
}