package workshop.account.exception;

public class InsufficientBalance extends Exception{
	
	public InsufficientBalance(String errMessage) {
		//�θ��� �����ڸ� ȣ��
		super(errMessage);
	}
}
