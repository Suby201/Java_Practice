package lab.bank.entity;

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
		
	}
	public void withdraw(double amount) {
		
	}
	@Override
	public String toString() {
		return "���¹�ȣ: " + accountNumber + ", ������: " + ownerName + ", �ܾ�: " + balance + "]";
	}
	
}
