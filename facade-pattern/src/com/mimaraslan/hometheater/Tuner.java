package com.mimaraslan.hometheater;

public class Tuner {

	public Tuner(String string, Amplifier amp) {
		System.out.println("Tuner:" + string + " Amplifier:" + amp);
	}

	public void on() {
		System.out.println("Tuner on");
	}

	public void setFrequency(double frequency) {
		System.out.println("Tuner setFrequency:" + frequency);
	}

	public void off() {
		System.out.println("Tuner off");
	}
}