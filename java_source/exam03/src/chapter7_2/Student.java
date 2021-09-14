package chapter7_2;

import java.util.ArrayList;

public class Student {
	private int studentID; // �й�
	private String name; // �л� �̸� 
	private ArrayList<Subject> subjects;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
		subjects = new ArrayList<Subject>();
	}
	
	public void addSubject(String title, int score) {
		subjects.add(new Subject(title, score));
	}
	
	public void showInfo() {
		System.out.println("�й� : " + studentID + ", �̸� : " + name);
		/*
		for (int i = 0; i < subjects.size(); i++) {
			Subject subject = subjects.get(i);
			subject.showSubjects();
		}
		*/
		for (Subject subject : subjects) {
			subject.showSubjects();
		}
		System.out.println("==========================");
	}
}
