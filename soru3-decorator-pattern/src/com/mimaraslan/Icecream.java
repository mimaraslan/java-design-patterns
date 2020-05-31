package com.mimaraslan;

public abstract class Icecream {

	public String description = "Unknown Ice cream";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}