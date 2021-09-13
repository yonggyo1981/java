package chapter5_1;

public class Student {
	int studentID; // 학번 
	String name; // 학생이름
	
	public Student() {
		studentID = 1001;
		name = "이름1";
	}
	
	public Student(int sID, String nm) {
		studentID = sID;
		name = nm;
	}
	
	public void showInfo() {
		System.out.println("학번 : " + studentID + ", 이름 : " + name);
	}
}