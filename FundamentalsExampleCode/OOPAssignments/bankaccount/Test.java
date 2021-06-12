package com.javastack.oop.bankaccount;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();
		BankAccount acc3 = new BankAccount();
		BankAccount acc4 = new BankAccount();
		BankAccount acc5 = new BankAccount();
		BankAccount acc6 = new BankAccount();
		
		System.out.println(BankAccount.getAllAccountTotal());
		
		acc1.depositTo(false, 323.50);
		acc1.depositTo(true, 400.00);
		
		acc1.getCheckingBalance();
		acc1.getSavingsBalance();
		
		double total = acc1.getAndDisplayAllAccountTotal();
		System.out.println(total);
		
		acc1.withdrawFrom(false, 20.00);
		acc1.withdrawFrom(true, 20.00);
		
		acc1.getCheckingBalance();
		acc1.getSavingsBalance();
		
		acc1.getAndDisplayAllAccountTotal();
		
		
		acc1.withdrawFrom(false, 320.00);
		acc1.withdrawFrom(true, 500.00);
		
		acc1.getCheckingBalance();
		acc1.getSavingsBalance();
		
		
		
		acc2.depositTo(false, 10.50);
		acc2.depositTo(true, 100.00);
		
		acc3.depositTo(false, 20.38);
		acc3.depositTo(true, 67.00);
		
		acc4.depositTo(false, 44.30);
		acc4.depositTo(true, 99.99);
		
		acc5.depositTo(false, 1.50);
		acc5.depositTo(true, 2.00);
		
		BankAccount.getAllAccountTotal();
		BankAccount.getNumAccounts();
		

	}

}
