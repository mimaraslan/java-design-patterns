package com.mimaraslan.hometheater;

public class CdPlayer {

	public CdPlayer(String string, Amplifier amp) {
		System.out.println("CdPlayer:" + string + " Amplifier:" + amp);
	}

	public void on() {
		System.out.println("CdPlayer on");
	}

	public void off() {
		System.out.println("CdPlayer off");
	}

	public void play(String cdTitle) {
		System.out.println("CdPlayer play");
	}

	public void eject() {
		System.out.println("CdPlayer eject");
	}
}