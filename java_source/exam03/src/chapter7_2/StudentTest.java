package chapter7_2;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1000, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 50);
		
		Student studentKim = new Student(1001, "Kim");
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 85);
		studentKim.addSubject("����", 100);
		
		studentLee.showInfo();
		studentKim.showInfo();
	}
}
