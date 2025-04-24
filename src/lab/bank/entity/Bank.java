package lab.bank.entity;

import java.util.List;


public class Bank {
	private List<Account> accounts;
	private int nextAccountNumber;
	
	public Bank() {
		
	}
	public String createSavingsAccount(String ownerName, double initialBalance, double interestRate) {
		return "";
	}
	public String createCheckingAccount(String ownerName, double initialBalance, double withdrawLimit) {
		return "";
	}
	public Account findAccount(String accountNumber) {
		for (Account account : accounts) {
			if(account.getAccountNumber().equals(accountNumber)){
				return account;
			}
		}
		return null;
	}
	public void deposit(String accountNumber, double amount) {
		
	}
	public void withdraw(String accountNumber, double amount) {
		
	}
	public void transfer(String fromAccountNumber, String toAccountNumber, double amount) {
		
	}
	public void printAllAccounts() {
		
	}
}
