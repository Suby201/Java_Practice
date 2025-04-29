package lab.bank.entity;

import java.util.ArrayList;
import java.util.List;

import lab.bank.exception.AccountNotFoundException;
import lab.bank.exception.InsufficientBalanceException;


public class Bank {
	private List<Account> accounts = new ArrayList<>();
	private int nextAccountNumber = 1000;
	
	public Bank() {
		
	}
	public String createSavingsAccount(String ownerName, double initialBalance, double interestRate) {
		String accountNumber = "AC"+nextAccountNumber;
		nextAccountNumber++;
		Account account = new SavingsAccount(accountNumber, ownerName, initialBalance, interestRate); 
		accounts.add(account);
		return "저축계좌가 생성되었습니다: " + account.toString();
	}
	public String createCheckingAccount(String ownerName, double initialBalance, double withdrawLimit) {
		String accountNumber = "AC"+nextAccountNumber;
		nextAccountNumber++;
		Account account = new CheckingAccount(accountNumber, ownerName, initialBalance, withdrawLimit); 
		accounts.add(account);
		return "체킹계좌가 생성되었습니다: " + account.toString();
		}
	public Account findAccount(String accountNumber) throws AccountNotFoundException{
		for (Account account : accounts) {
			if(account.getAccountNumber().equals(accountNumber)){
				return account;
			}
		}
		String errMessage = String.format(accountNumber+"에 해당하는 계좌를 찾을 수 없습니다.");
		throw new AccountNotFoundException(errMessage);
	}
	public void deposit(String accountNumber, double amount) throws AccountNotFoundException{
		Account account = findAccount(accountNumber);
		account.deposit(amount);
	}
	public void withdraw(String accountNumber, double amount) throws AccountNotFoundException, InsufficientBalanceException {
		Account account = findAccount(accountNumber);
		account.withdraw(amount);
	}
	public void transfer(String fromAccountNumber, String toAccountNumber, double amount) throws AccountNotFoundException, InsufficientBalanceException {
		Account account1 = findAccount(fromAccountNumber);
		Account account2 = findAccount(toAccountNumber);
		account1.withdraw(amount);
		account2.deposit(amount);
		System.out.println(amount+"원이 " + fromAccountNumber+"에서 "+toAccountNumber+"로 송금되었습니다.");
	}
	public void printAllAccounts() {
		for (Account account : accounts) {
			System.out.println(account.toString());
			
		}
	}
}
