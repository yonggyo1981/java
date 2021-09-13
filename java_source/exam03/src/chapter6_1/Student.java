package chapter6_1;

public class Student {
	private int studentID; // �й�
	private String name; // �л� �̸�
	
	public Student() {
		this(1000, "�̸�����");
		studentID = 2000;
	}
	
	public Student(int studentID, String name) { 
		this.studentID = studentID;
		this.name = name;
	}
	
	public  Student setStudentID(int studentID) {
		this.studentID = studentID;
		
		return this;
	}
	
	public Student setName(String name) {
		this.name = name;
		
		return this;
	}
	
	public void showInfo() {
		System.out.println("�й� : " + studentID + ", �̸� : " + name);
	}
}
