package chapter06;

public class Student {
	static int schoolId = 10;
	
	public Student() {
		
	}
	
	int age;  // ��� ���� -> �ν��Ͻ��� ������ �� 
	String name;  // ��� ���� -> �ν��Ͻ��� ������ ��
	
	static void staticPrint() {
		System.out.println("static");
	}
	
	void print() {
		schoolId = 20;
		staticPrint();
		System.out.println("instance");
	}
}
