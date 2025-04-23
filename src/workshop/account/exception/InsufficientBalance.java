package workshop.account.exception;

public class InsufficientBalance extends Exception{
	
	public InsufficientBalance(String errMessage) {
		//부모의 생성자를 호출
		super(errMessage);
	}
}
