package chapter15_5;

import java.util.ArrayList;
import java.io.Serializable;

public class StudentList implements Serializable {
	
	private ArrayList<Student> list;
	
	public StudentList() {
		list = new ArrayList<Student>();
	}
	
	public void addStudent(Student s) {
		list.add(s);
	}
	
	public void showList() {
		for (Student s : list) {
			System.out.println(s);
		}
	}
}
