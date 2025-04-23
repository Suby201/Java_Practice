package workshop.account.entity;

import workshop.account.exception.InsufficientBalance;

public class Account {
	private String custId;
	private String acctId;
	private int balance;
	
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public void setAcctId(String acctId) {
		this.acctId = acctId;
		
	}
//	public void setBalance(int newBalance) {
//		this.balance = newBalance;
//	}
	public int getBalance() {
		return balance;
	}
	public String getCustId() {
		return custId;
	}
	public String getAcctId() {
		return acctId;
	}
	//입금
	public void deposit(int amount) {
		this.balance += amount; 
	}
	
	//출금
	public void withdraw(int amount) throws InsufficientBalance{
		if(amount>balance) {
			String errMessage = String.format("잔액이 부족합니다.(요청금액: %d원, 현재 잔액: %d원)", amount, balance);
			throw new InsufficientBalance(errMessage);
		}
		else {
			this.balance -= amount;
		}
	}
	@Override
	public String toString() {
		return "Account [custId=" + custId + ", acctId=" + acctId + ", balance=" + balance + "]";
	}

}
