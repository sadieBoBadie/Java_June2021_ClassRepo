package com.javastack.oop.phone;

public class Galaxy extends Phone {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String unlock() {
		// TODO Unlocking via fingerprint
		return new String("Unlocking via fingerprint");	
	}

}
