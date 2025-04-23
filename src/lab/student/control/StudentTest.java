package lab.student.control;

import lab.student.entity.Student;
import lab.student.exception.InvalidGradeException;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student("18783","김민수","컴퓨터공학",3);
		System.out.println("학번: " + stud.getStudentId() +"\t 이름: " + stud.getName() + "\t 전공: " + stud.getMajor() + "\t 학년 : " + stud.getGrade());
		System.out.println("5학년으로 변겅");
		try {
			stud.setGrade(5);
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
