package com.mimaraslan;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Subcriber implements Observer {

	private String name;
	private Channel channel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Subcriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));
		System.out.println(getName() + ", There is news from your sister. ---> " + getChannel().getMessage());
	}

	@Override
	public void subcribeChannel(Channel channel) {
		this.channel = channel;
	}
}