package chapter06;

public class Student {
	static int schoolId = 10;
	
	int age;  // ��� ���� -> �ν��Ͻ��� ������ �� 
	String name;  // ��� ���� -> �ν��Ͻ��� ������ ��
	
	static void staticPrint() {
		System.out.println("static");
	}
	
	void print() {
		System.out.println("instance");
	}
}
