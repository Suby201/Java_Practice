package lab.bank.entity;

import lab.bank.exception.InsufficientBalanceException;
import lab.bank.exception.WithdrawLimitExceededException;
import lab.student.exception.InvalidGradeException;

public class CheckingAccount extends Account {
	private double withdrawLimit;

	public CheckingAccount(String accountNumber, String ownerName, double balance, double withdrawLimit) {
		super(accountNumber, ownerName, balance);
		this.withdrawLimit = withdrawLimit;
	}
	
	
	public double getWithdrawLimit() {
		return withdrawLimit;
	}
	
	@Override
	public void withdraw(double amount) throws InsufficientBalanceException {
		if(amount>withdrawLimit) {
			String errMessage = String.format("��� �ѵ� �ʰ�, �ѵ�: "+withdrawLimit+"��");
			throw new WithdrawLimitExceededException(errMessage);
		} else {
			super.withdraw(amount);
		}
	}
	@Override
	public String toString() {
		return "���¹�ȣ: " + getAccountNumber() + ", ������: " + getOwnerName() + ", �ܾ�: " + getBalance() + ", ��� �ѵ�: "+withdrawLimit+"��";
	}

}
