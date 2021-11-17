package chapter11;

public class Student {
	private int id; // �й�
	private String name; // �̸�
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void print() {
		System.out.printf("���̵� : %d, �̸� : %s%n", id, name);
	}
	
	public int getId() {
		return id;
	}
	
	public boolean equals(Object obj) {
		return id == ((Student)obj).getId();
	}
	
	public int hashCode() {
		return id;
	}
	
	public String toString() {
		return "���̵� : " + id + ", �̸� : " + name;
	}
	
}
