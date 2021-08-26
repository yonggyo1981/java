package chapter7_2;

import java.util.ArrayList;

public class Student {
	private int studentID; // �й� 
	private String studentName; // �̸�
	private ArrayList<Subject> subjects; // ���� ���� 
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjects = new ArrayList<Subject>();
	}
	
	public void addSubject(String name, int score) {
		subjects.add(new Subject(name, score));
	}
	
	public void showInfo() {
		int total = 0;
		for (Subject sub : subjects) {
			total += sub.getScore();
			System.out.println("�л� " + studentName + "�� " + sub.getName() + " ���� ������ " + sub.getScore() + "�Դϴ�.");
		}
		
		System.out.println("�л� " + studentName + "�� ���� : " + total); 
	}
}
