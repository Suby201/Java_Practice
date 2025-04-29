package lab.bank.control;

import lab.bank.entity.Bank;
import lab.bank.entity.SavingsAccount;
import lab.bank.exception.AccountNotFoundException;
import lab.bank.exception.InsufficientBalanceException;


public class BankDemo {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
		createAccounts(bank);
		printAll(bank);
		testDW(bank);
		InterestTest(bank);
		testTransfer(bank);
		printAll(bank);
		testException(bank);
		
	}

	private static void testException(Bank bank) {
		try {
			bank.withdraw("AC1001", 10000.0);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.withdraw("AC1000", 20000.0);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			bank.findAccount("AC9999");
		} catch(AccountNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void testTransfer(Bank bank) {
		System.out.println("=== ������ü �׽�Ʈ ===");
		try {
			bank.transfer("AC1002", "AC1001", 5000.0);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void InterestTest(Bank bank) {
		System.out.println("=== ���� ���� �׽�Ʈ ===");
		SavingsAccount account1 = null;
		try {
			account1 = (SavingsAccount) bank.findAccount("AC1000");
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		account1.applyInterest();
		SavingsAccount account2 = null;
		try {
			account2 = (SavingsAccount) bank.findAccount("AC1002");
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		account2.applyInterest();
	}

	private static void testDW(Bank bank) {
		System.out.println("=== �Ա�/��� �׽�Ʈ ===");
		try {
			bank.deposit("AC1000", 5000.0);
		} catch (AccountNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
		bank.withdraw("AC1001", 3000.0);
		} catch(InsufficientBalanceException e) {
			e.printStackTrace();
		} catch (AccountNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printAll(Bank bank) {
		System.out.println("=== ��� ���� ��� ===");
		bank.printAllAccounts();
	}

	private static void createAccounts(Bank bank) {
		System.out.println("=== ���� ���� ===");
		System.out.println(bank.createSavingsAccount("ȫ�浿", 10000.0, 3.0));
		System.out.println(bank.createCheckingAccount("��ö��", 20000.0, 5000.0));
		System.out.println(bank.createSavingsAccount("�̿���", 30000.0, 2.0));
	}

}
