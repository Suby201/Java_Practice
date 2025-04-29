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
			String errMessage = String.format("출금 한도 초과, 한도: "+withdrawLimit+"원");
			throw new WithdrawLimitExceededException(errMessage);
		} else {
			super.withdraw(amount);
		}
	}
	@Override
	public String toString() {
		return "계좌번호: " + getAccountNumber() + ", 소유주: " + getOwnerName() + ", 잔액: " + getBalance() + ", 출금 한도: "+withdrawLimit+"원";
	}

}
