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
	//�Ա�
	public void deposit(int amount) {
		this.balance += amount; 
	}
	
	//���
	public void withdraw(int amount) throws InsufficientBalance{
		if(amount>balance) {
			String errMessage = String.format("�ܾ��� �����մϴ�.(��û�ݾ�: %d��, ���� �ܾ�: %d��)", amount, balance);
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
