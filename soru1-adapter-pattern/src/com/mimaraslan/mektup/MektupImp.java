package com.mimaraslan.mektup;

public class MektupImp implements Mektup {

	@Override
	public void getIletisimAraci() {
		System.out.println("Mektup");
	}

	@Override
	public void getIletisimMesaji() {
		System.out.println("Mektup ile iletisim kuruldu.");
	}
}