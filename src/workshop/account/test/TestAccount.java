package workshop.account.test;

import workshop.account.entity.Account;
import workshop.account.exception.InsufficientBalance;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.setCustId("A1100");
		account.setAcctId("221-22-3477");
		account.deposit(100000);
		System.out.println(account);
		System.out.print("����ȣ: " + account.getCustId()+" ");
		System.out.println("���¹�ȣ: " + account.getAcctId());
		System.out.println("�ܾ�: " + account.getBalance()+"��");
		account.deposit(10000);
		System.out.println("�ܾ�: " + account.getBalance()+"��");
		try {
			account.withdraw(20000);
			System.out.println("�ܾ�: " + account.getBalance()+"��");
			account.withdraw(100000);
			System.out.println("�ܾ�: " + account.getBalance()+"��");
		} catch (InsufficientBalance e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
