package chapter5;

public class Subject2Test {
	public static void main(String[] args) {
		Student2 student = new Student2(1001, 40, "�̸�");
		student.addSubject("����", 90);
		student.addSubject("����", 80);
		
		student.showInfo();
	}
}
