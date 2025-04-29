package lab.bank.entity;

import lab.bank.exception.InsufficientBalanceException;
import lab.bank.exception.WithdrawLimitExceededException;

public class Account {
	private String accountNumber;
	private String ownerName;
	private double balance;

	public Account(String accountNumber, String ownerName, double balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + balance + "원");
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			String errMessage = String.format("잔액부족");
			throw new InsufficientBalanceException(errMessage);
		} else {
			balance = balance - amount;
			System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + balance + "원");
		}
	}

	@Override
	public String toString() {
		return "계좌번호: " + accountNumber + ", 소유주: " + ownerName + ", 잔액: " + balance;
	}

}
