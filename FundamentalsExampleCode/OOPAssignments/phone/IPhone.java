/**
 * 
 */
package com.javastack.oop.phone;

/**
 * @author sadieflick
 *
 */
public class IPhone extends Phone {

	/**
	 * @param versionNumber
	 * @param batteryPercentage
	 * @param carrier
	 * @param ringTone
	 */
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
		
	}

	@Override
	public String unlock() {
		// TODO Unlocking via fingerprint
		return new String("Unlocking via facial recognition");	
	}


}
