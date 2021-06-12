package com.javastack.oop.bankaccount;

import java.util.HashMap;
import java.util.Random;

public class BankAccount {
	
	private Integer accountNumber;
	private double checkingBalance;
	private double savingsBalance;
	
	private static int numAccounts = 0;
	private static double allAccountTotal = 0;
	private static HashMap<Integer, BankAccount> allAccounts = new HashMap<Integer, BankAccount>();
	
	public BankAccount() {
		this.accountNumber = newAccNum();
		allAccounts.put(accountNumber, this);
		numAccounts++;
		System.out.printf("Creating new account %s\n", accountNumber);
	}
	
	public static double getAllAccountTotal() {
		System.out.printf("All Accounts Total: %.2f\n", allAccountTotal);
		return allAccountTotal;
	}
	
	public static int getNumAccounts() {
		System.out.printf("Total Number of Accounts: %s\n", numAccounts);
		return numAccounts;
	}
	
	// Create a private method that returns a 
	// random ten digit account number.
	private Integer newAccNum() {
		
		Random randomSeed = new Random();
		Integer accountNum = (Integer) (randomSeed.nextInt(1147483648) + 999999999);
		
		while (allAccounts.containsKey(accountNum)) {
			accountNum = (Integer) (randomSeed.nextInt(1147483648) + 999999999);
		}
		
		return accountNum;
	}
	
//	● Create a getter method for the user's checking account balance.
	public double getCheckingBalance() {
		System.out.printf("Checking Balance for Account %s: %.2f\n", this.accountNumber, this.checkingBalance);
		return checkingBalance;
	}
	
//	● Create a getter method for the user's saving account balance.
	public double getSavingsBalance() {
		System.out.printf("Savings Balance for Account %s: %.2f\n", this.accountNumber, this.savingsBalance);
		return savingsBalance;
	}
	
//	Create a method that will allow a user to deposit money 
//	into either the checking or saving, be sure to add to total 
//	amount stored.
	public boolean depositTo(boolean isChecking, double amount) {
		
		allAccountTotal+= amount;
		
		if (isChecking) {
			checkingBalance += amount;
			System.out.printf("Depositing $%.2f to checking.\n", amount);
		}
		else {
			savingsBalance += amount;
			System.out.printf("Depositing $%.2f to savings.\n", amount);
		}
		return true;
	}
//	● Create a method to withdraw money from one balance. 
//	Do not allow them to withdraw money if there are insufficient funds.
	public boolean withdrawFrom(boolean isChecking, double amount) {
		if (isChecking) {
			if (checkingBalance - amount >= 0) {
				checkingBalance -= amount;
				allAccountTotal-= amount;
				System.out.printf("Withdrawing $%.2f frm checking.\n", amount);
				return true;
			}
			System.out.printf("Account Balance is %.2f\n. There are insufficient funds to withdraw that amount.\n", checkingBalance);
		}
		else {
			if (savingsBalance - amount >= 0) {
				savingsBalance -= amount;
				allAccountTotal-= amount;
				System.out.printf("Withdrawing $%.2f from savings\n", amount);
				return true;
			}
			System.out.printf("Account Balance is %.2f\n. There are insufficient funds to withdraw that amount.\n", savingsBalance);
		
		}
		return false;
	}
//	● Create a method to see the total money from the checking and saving.
	public double getAndDisplayAllAccountTotal() {
		double total = this.checkingBalance + this.savingsBalance;
		System.out.printf("Total in Checking and Savings: %.2f\n", total);
		return total;
	}
//	● Users should not be able to set any of the attributes from the class.
	
	
}
