package chapter5_2;

public class Student {
	static int serialNum = 1000; // �Ϸù�ȣ // ����(���� - ����) // ������ ���� 
	int studentID; // ��� ���� -> �� ���� 
	
	Student() {
		serialNum++;
		studentID = serialNum;
	}
	
	int getStudentID() {
		return studentID;
	}
	
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
