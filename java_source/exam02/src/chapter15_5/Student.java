package chapter15_5;

public class Student {
	private int studentID;
	private String name;
	private int age;
	
	public Student(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "�й� : " + studentID + ", �̸� : " + name + ", ���� : " + age;
	}
}
