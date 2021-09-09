package chapter15_5;

import java.util.ArrayList;

public class Student {
	private int studentID;
	private String name;
	private int age;
	
	private ArrayList<Student> list;
	
	public Student(int studentID, String name, int age) {
		this.studentID = studentID;
		this.name = name;
		this.age = age;
		
		list = new ArrayList<Student>();
	}
}
