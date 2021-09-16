package chapter11_3;

public class Student {
	private int studentID;
	private String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	@Override 
	public String toString() {
		return "학번 : " + studentID + ", 이름 : " + name;
	}
}
