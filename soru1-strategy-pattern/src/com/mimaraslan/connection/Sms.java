package com.mimaraslan.connection;

import com.mimaraslan.Communicate;

public class Sms implements Communicate {

	@Override
	public void connect() {
		System.out.println("Sms");
	}
}