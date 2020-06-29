package com.mimaraslan.telgraf;

import com.mimaraslan.mektup.Mektup;

public class TelgrafAdapter implements Mektup {

	Telgraf obj;

	public TelgrafAdapter(Telgraf obj) {
		this.obj = obj;
	}

	public void getIletisimAraci() {
		obj.getIletisimAraci();
	}

	public void getIletisimMesaji() {
		obj.getIletisimMesaji();
	}
}