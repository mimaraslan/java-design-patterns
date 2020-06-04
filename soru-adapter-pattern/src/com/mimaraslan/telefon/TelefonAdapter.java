package com.mimaraslan.telefon;

import com.mimaraslan.mektup.Mektup;

public class TelefonAdapter implements Mektup {

	Telefon obj;

	public TelefonAdapter(Telefon obj) {
		this.obj = obj;
	}

	public void getIletisimAraci() {
		obj.getIletisimAraci();
	}

	public void getIletisimMesaji() {
		obj.getIletisimMesaji();
	}
}