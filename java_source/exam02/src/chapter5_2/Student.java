package chapter5_2;

public class Student {
	static int serialNum; // �Ϸù�ȣ // ����(���� - ����) // ������ ���� 
	int studentID; // ��� ���� -> �� ���� 
	
	void method() {
		staticMethod();
		serialNum = 10;
		System.out.println("�ν��Ͻ� �޼���");
	}
	
	static void staticMethod() {
		//method();
		//studentID = 10;
		System.out.println("���� �޼���");
	}
	
}
