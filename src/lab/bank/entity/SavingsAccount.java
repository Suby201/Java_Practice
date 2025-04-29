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
		System.out.println("���� "+amount+"���� �ԱݵǾ����ϴ�. ���� �ܾ�: "+getBalance()+"��");
	}
	@Override
	public String toString() {
		return "���¹�ȣ: " + getAccountNumber() + ", ������: " + getOwnerName() + ", �ܾ�: " + getBalance() + ", ������: "+interestRate+"%";
	}
	
}
