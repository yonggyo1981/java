package chapter5_1;

public class Student {
	int studentID; // �й� 
	String name; // �л��̸�
	
	public Student() {
		studentID = 1001;
		name = "�̸�1";
	}
	
	public Student(int sID, String nm) {
		studentID = sID;
		name = nm;
	}
	
	public void showInfo() {
		System.out.println("�й� : " + studentID + ", �̸� : " + name);
	}
}