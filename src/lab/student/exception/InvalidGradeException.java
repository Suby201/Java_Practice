package lab.student.exception;

public class InvalidGradeException extends Exception {
	public InvalidGradeException(String errMessage) {
		//부모의 생성자를 호출
		super(errMessage);
	}
}
