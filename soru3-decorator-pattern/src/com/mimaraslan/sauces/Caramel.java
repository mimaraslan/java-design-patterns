package com.mimaraslan.sauces;

import com.mimaraslan.Icecream;

public class Caramel extends CondimentDecorator {

	public Caramel(Icecream icecream) {
		this.icecream = icecream;
	}

	public String getDescription() {
		return icecream.getDescription() + ", Caramel";
	}

	public double cost() {
		return .12 + icecream.cost();
	}
}