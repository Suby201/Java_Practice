package lab.bank.exception;

public class WithdrawLimitExceededException extends InsufficientBalanceException{
	public WithdrawLimitExceededException(String message) {
		super(message);
	}
}
