package com.mimaraslan;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	private List <Subcriber> subcribers = new ArrayList<>();
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void subcribe(Subcriber subcriber) {
		subcribers.add(subcriber);
	}

	@Override
	public void unsubcribe(Observer subcriber) {
		subcribers.remove(subcriber);
	}
	
	@Override
	public void notifySubcribers() {
		for (Observer subcriber: subcribers) {
			subcriber.update();
		}
	}
	
	@Override
	public void reportMessage(String message) {
		this.message = message;
		notifySubcribers();
	}
}