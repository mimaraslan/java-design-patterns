package com.mimaraslan.hometheater;

public class Amplifier {

	public Amplifier(String string) {
		System.out.println("Amplifier:" + string);
	}

	public void on() {
		System.out.println("Amplifier on");
	}

	public void setDvd(DvdPlayer dvd) {
		System.out.println("Amplifier setDvd: " + dvd);
	}

	public void setSurroundSound() {
		System.out.println("Amplifier setSurroundSound");
	}

	public void setVolume(int i) {
		System.out.println("Amplifier setVolume: " + i);
	}

	public void off() {
		System.out.println("Amplifier off");
	}

	public void setCd(CdPlayer cd) {
		System.out.println("Amplifier setCd:" + cd);
	}

	public void setStereoSound() {
		System.out.println("Amplifier setStereoSound");
	}

	public void setTuner(Tuner tuner) {
		System.out.println("Amplifier setTuner:" + tuner);
	}

}