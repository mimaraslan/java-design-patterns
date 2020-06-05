package com.mimaraslan.connection;

import com.mimaraslan.Communicate;

public class Telegram implements Communicate {

	@Override
	public void connect() {
		System.out.println("Telegram");
	}
}