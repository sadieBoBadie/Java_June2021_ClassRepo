package com.javastack.oop.phone;

public class Main {

	public static void main(String[] args) {
		Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring Ring Ring!");
		IPhone iPhoneX = new IPhone("X", 100, "AT&T", "Zinga-dee-doo-da");
		
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		
		iPhoneX.displayInfo();
		System.out.println(iPhoneX.ring());
		System.out.println(iPhoneX.unlock());

	}

}
