package chapter7_2;

public class StudentTest {
	public static void main(String[] args) {
		Student lee = new Student(1001, "Lee");
		lee.addSubject("����", 100);
		lee.addSubject("����", 50);
		
		Student kim = new Student(1002, "Kim");
		kim.addSubject("����", 70);
		kim.addSubject("����", 80);
		kim.addSubject("����", 100);
		
		System.out.println("------------- LEE ------------");
		lee.showInfo();
		
		System.out.println("------------- KIM ------------");
		kim.showInfo();
	}
}
