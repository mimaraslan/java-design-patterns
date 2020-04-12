package com.mimaraslan.hometheater;

public class DvdPlayer {

	public DvdPlayer(String string, Amplifier amp) {
		System.out.println("DvdPlayer:" + string + " Amplifier:" + amp);
	}

	public void play(String movie) {
		System.out.println("DvdPlayer play");
	}

	public void on() {
		System.out.println("DvdPlayer on");
	}

	public void stop() {
		System.out.println("DvdPlayer stop");
	}

	public void eject() {
		System.out.println("DvdPlayer eject");
	}

	public void off() {
		System.out.println("DvdPlayer off");
	}
}