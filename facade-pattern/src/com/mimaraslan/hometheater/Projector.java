package com.mimaraslan.hometheater;

public class Projector {

	public Projector(String string, DvdPlayer dvd) {
		System.out.println("Projector: " + string + " DvdPlayer:" + dvd);
	}

	public void on() {
		System.out.println("Projector on");
	}

	public void wideScreenMode() {
		System.out.println("Projector wideScreenMode");
	}

	public void off() {
		System.out.println("Projector off");
	}
}