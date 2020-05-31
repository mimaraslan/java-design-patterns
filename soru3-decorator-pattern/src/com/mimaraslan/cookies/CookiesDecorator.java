package com.mimaraslan.cookies;

import com.mimaraslan.Icecream;

public abstract class CookiesDecorator extends Icecream {

	Icecream icecream;

	public abstract String getDescription();
}