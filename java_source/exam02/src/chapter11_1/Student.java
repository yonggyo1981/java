package chapter11_1;

public class Student {
	int studentID; // �й�
	String name; // �̸� 
	
	Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "�й� : " + studentID + ", �̸� : " + name;
	}
}
