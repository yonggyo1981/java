package chapter6_3;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		//s1.serialNum = 1000;
		//System.out.println("s1 : " + s1.serialNum);
		
		//s2.serialNum = 1001;
		//System.out.println("s1 : " + s1.serialNum);
		//System.out.println("s2 : " + s2.serialNum);
		
		// s1, s1 -> serialNum ���� ���� -> ������ ���� 1���� ����(����)
		
		// Ŭ������.����������
		Student.serialNum = 1000;
		System.out.println(Student.serialNum);
		
	}
}
