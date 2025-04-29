package lab.bank.entity;

public class SavingsAccount extends Account {
	private double interestRate;
	
	public SavingsAccount(String accountNumber, String ownerName, double initialBalance, double interestRate) {
		super(accountNumber, ownerName, initialBalance);
		this.interestRate = interestRate;
		
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void applyInterest() {
		double amount = getBalance() * (interestRate/100);
		deposit(amount);
		System.out.println("이자 "+amount+"원이 입금되었습니다. 현재 잔액: "+getBalance()+"원");
	}
	@Override
	public String toString() {
		return "계좌번호: " + getAccountNumber() + ", 소유주: " + getOwnerName() + ", 잔액: " + getBalance() + ", 이자율: "+interestRate+"%";
	}
	
}
