package chapter5;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = student1; // student3���� student1�� �ּ�
				
		System.out.println("student1 = " + student1);
		System.out.println("student2 = " + student2);
		
		student1.setStudentName("�̸�1");
		student2.setStudentName("�̸�2");
		
		System.out.println("student1 = " + student1.getStudentName());
		System.out.println("student2 = " + student2.getStudentName());
		System.out.println("student3 = " + student3.getStudentName());
	}
}
