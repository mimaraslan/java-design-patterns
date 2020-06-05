package com.mimaraslan.connection;

import com.mimaraslan.Communicate;

public class Letter implements Communicate {

	@Override
	public void connect() {
		System.out.println("Letter");
	}
}