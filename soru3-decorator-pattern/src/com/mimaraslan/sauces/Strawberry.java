package com.mimaraslan.sauces;

import com.mimaraslan.Icecream;

public class Strawberry extends CondimentDecorator {

	public Strawberry(Icecream icecream) {
		this.icecream = icecream;
	}

	public String getDescription() {
		return icecream.getDescription() + ", Strawberry";
	}

	public double cost() {
		return .315 + icecream.cost();
	}
}