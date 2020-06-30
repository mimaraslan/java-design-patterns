package com.mimaraslan;

public interface Subject {

	void subcribe(Subcriber subcriber);

	void unsubcribe(Observer subcriber);

	void notifySubcribers();

	void reportMessage(String message);

}