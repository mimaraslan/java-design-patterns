package com.mimaraslan.telefon;

public class TelefonImp implements Telefon {

	@Override
	public void getIletisimAraci() {
		System.out.println("Telefon");
	}

	@Override
	public void getIletisimMesaji() {
		System.out.println("Telefon ile iletisim kuruldu.");
	}

}