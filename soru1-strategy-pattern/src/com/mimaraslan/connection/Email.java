package com.mimaraslan.connection;

import com.mimaraslan.Communicate;

public class Email implements Communicate {
	
	@Override
	public void connect() {
		System.out.println("Email");
	}
}