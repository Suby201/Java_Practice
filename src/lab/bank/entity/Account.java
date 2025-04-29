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
		System.out.println(amount + "���� �ԱݵǾ����ϴ�. ���� �ܾ�: " + balance + "��");
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			String errMessage = String.format("�ܾ׺���");
			throw new InsufficientBalanceException(errMessage);
		} else {
			balance = balance - amount;
			System.out.println(amount + "���� ��ݵǾ����ϴ�. ���� �ܾ�: " + balance + "��");
		}
	}

	@Override
	public String toString() {
		return "���¹�ȣ: " + accountNumber + ", ������: " + ownerName + ", �ܾ�: " + balance;
	}

}
