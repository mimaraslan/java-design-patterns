package com.mimaraslan;

import java.text.DecimalFormat;

import com.mimaraslan.cookies.Hazelnut;
import com.mimaraslan.cookies.Peanut;
import com.mimaraslan.cookies.Walnut;
import com.mimaraslan.icecream.Blue;
import com.mimaraslan.icecream.Cream;
import com.mimaraslan.icecream.Lemon;
import com.mimaraslan.sauces.Blackberry;
import com.mimaraslan.sauces.Caramel;
import com.mimaraslan.sauces.Chocolate;
import com.mimaraslan.sauces.Strawberry;

public class AppMain {

	public static void main(String args[]) {

		DecimalFormat df = new DecimalFormat("#.##");

		Icecream icecream1 = new Lemon();
		icecream1 = new Chocolate(icecream1);
		icecream1 = new Caramel(icecream1);
		icecream1 = new Walnut(icecream1);
		System.out.println(icecream1.getDescription() + " $" + df.format(icecream1.cost()));

		Icecream icecream2 = new Cream();
		icecream2 = new Chocolate(icecream2);
		icecream2 = new Chocolate(icecream2);
		icecream2 = new Blackberry(icecream2);
		icecream2 = new Hazelnut(icecream2);
		System.out.println(icecream2.getDescription() + " $" + df.format(icecream2.cost()));

		Icecream icecream3 = new Blue();
		icecream3 = new Strawberry(icecream3);
		icecream3 = new Chocolate(icecream3);
		icecream3 = new Blackberry(icecream3);
		icecream3 = new Peanut(icecream3);
		System.out.println(icecream3.getDescription() + " $" + df.format(icecream3.cost()));
	}
}