package com.mimaraslan.telgraf;

public class TelgrafImp implements Telgraf {

	@Override
	public void getIletisimAraci() {
		System.out.println("Telgraf");
	}

	@Override
	public void getIletisimMesaji() {
		System.out.println("Telgraf ile iletisim kuruldu.");
	}

}