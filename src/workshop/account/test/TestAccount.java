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
		System.out.print("°í°´¹øÈ£: " + account.getCustId()+" ");
		System.out.println("°èÁÂ¹øÈ£: " + account.getAcctId());
		System.out.println("ÀÜ¾×: " + account.getBalance()+"¿ø");
		account.deposit(10000);
		System.out.println("ÀÜ¾×: " + account.getBalance()+"¿ø");
		try {
			account.withdraw(20000);
			System.out.println("ÀÜ¾×: " + account.getBalance()+"¿ø");
			account.withdraw(100000);
			System.out.println("ÀÜ¾×: " + account.getBalance()+"¿ø");
		} catch (InsufficientBalance e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
