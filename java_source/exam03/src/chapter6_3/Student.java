package chapter6_3;

public class Student {
	public static int serialNum = 1000; // �Ϸù�ȣ 
	public int studentID; // �й� 
	public String name; // �̸�
	public final int NUM = 100;
	
	
	public Student() {
		studentID = ++serialNum;
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public static int getSerialNum() {
		// ��� ����, �ν��Ͻ� �޼��� -> ��� �� �� �ִ°�?
		//studentID = 100;
		return serialNum;
	}
	
	public void showInfo() {
		// ���� ����, ���� �޼��� ������ �����Ѱ�?		
		System.out.println("�й� : " + studentID + ", �̸� : " + name);
	}
}
