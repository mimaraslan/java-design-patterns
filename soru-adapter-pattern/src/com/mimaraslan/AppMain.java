package com.mimaraslan;

import com.mimaraslan.mektup.Mektup;
import com.mimaraslan.mektup.MektupImp;
import com.mimaraslan.telefon.TelefonAdapter;
import com.mimaraslan.telefon.TelefonImp;
import com.mimaraslan.telgraf.TelgrafAdapter;
import com.mimaraslan.telgraf.TelgrafImp;

public class AppMain {

	public static void main(String[] args) {

		System.out.println("Haberlesme durumu...");
		System.out.println("--------------------------------");

		MektupImp mektup = new MektupImp();
		haberlesmeKur(mektup);
		System.out.println("--------------------------------");

		TelefonImp telefon = new TelefonImp();
		Mektup telefonAdapter = new TelefonAdapter(telefon);
		haberlesmeKur(telefonAdapter);
		System.out.println("--------------------------------");

		TelgrafImp telgraf = new TelgrafImp();
		Mektup telgrafAdapter = new TelgrafAdapter(telgraf);
		haberlesmeKur(telgrafAdapter);
		System.out.println("--------------------------------");
	}

	static void haberlesmeKur(Mektup mektup) {
		mektup.getIletisimAraci();
		mektup.getIletisimMesaji();
	}
}
