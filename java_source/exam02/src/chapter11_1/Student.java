package chapter11_1;

public class Student {
	int studentID; // 학번
	String name; // 이름 
	
	Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "학번 : " + studentID + ", 이름 : " + name;
	}
}
