package chapter11_1;

public class StudentTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(20001425, "�̸�1");
		Student s2 = new Student(20001425, "�̸�1");
		
		Student s3 = (Student)s2.clone();
		
		System.out.println("s1�� s2 �ּ� ��ġ? : " + (s1 == s2));
		System.out.println("s1�� s2�� equals(���� ��ġ) ? : " + (s1.equals(s2)));
	}
}
