package chapter5_1;

public class Student {
	int studentID; // �й�  // �⺻ �ڷ��� 
	String name; // �л��̸� // �����ڷ��� JDK ���� �⺻ Ŭ����
	Subject kor;
	
	
	public Student() {
		studentID = 1001;
		name = "�̸�1";
	}
	
	public Student(int sID, String nm) {
		studentID = sID;
		name = nm;
		kor = new Subject("����", 60);
	}
	
	public void showInfo() {
		System.out.println("�й� : " + studentID + ", �̸� : " + name);
	}
}