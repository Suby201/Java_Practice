package lab.student.control;

import lab.student.entity.Student;
import lab.student.exception.InvalidGradeException;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student("18783","��μ�","��ǻ�Ͱ���",3);
		System.out.println("�й�: " + stud.getStudentId() +"\t �̸�: " + stud.getName() + "\t ����: " + stud.getMajor() + "\t �г� : " + stud.getGrade());
		System.out.println("5�г����� ����");
		try {
			stud.setGrade(5);
		} catch (InvalidGradeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
