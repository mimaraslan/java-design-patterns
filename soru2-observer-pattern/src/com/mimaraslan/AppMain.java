package com.mimaraslan;

public class AppMain {

	public static void main(String[] args) throws InterruptedException {

		Subcriber subcriber1 = new Subcriber("Azman Baba");
		Subcriber subcriber2 = new Subcriber("Azman Abi");
		Subcriber subcriber3 = new Subcriber("Azman Kardes");
		Subcriber subcriber4 = new Subcriber("Azman Amca");
		Subcriber subcriber5 = new Subcriber("Azman Dayi");

		Channel channel1 = new Channel();
		channel1.subcribe(subcriber1);
		channel1.subcribe(subcriber2);
		channel1.subcribe(subcriber3);
		channel1.subcribe(subcriber4);
		channel1.subcribe(subcriber5);

		// We can remove the person we want without listening.
		channel1.unsubcribe(subcriber4);// for example, Azman Amca have removed.

		subcriber1.subcribeChannel(channel1);
		subcriber2.subcribeChannel(channel1);
		subcriber3.subcribeChannel(channel1);
		subcriber4.subcribeChannel(channel1);
		subcriber5.subcribeChannel(channel1);

		channel1.reportMessage("She goes to meet her boyfriend on Monday");
		Thread.sleep(2000);
		System.out.println("----------------------------------");

		channel1.reportMessage("She goes to meet her boyfriend on Wednesday");
		Thread.sleep(2000);
		System.out.println("----------------------------------");

		channel1.reportMessage("She goes to meet her boyfriend on Friday");
		System.out.println("----------------------------------");
	}
}