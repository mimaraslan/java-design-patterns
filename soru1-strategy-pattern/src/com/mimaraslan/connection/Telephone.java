package com.mimaraslan.connection;

import com.mimaraslan.Communicate;

public class Telephone implements Communicate {

	@Override
	public void connect() {
		System.out.println("Telephone");
	}
}