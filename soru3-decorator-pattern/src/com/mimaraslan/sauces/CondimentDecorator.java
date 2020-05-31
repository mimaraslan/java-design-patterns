package com.mimaraslan.sauces;

import com.mimaraslan.Icecream;

public abstract class CondimentDecorator extends Icecream {

	Icecream icecream;

	public abstract String getDescription();
}