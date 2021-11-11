package chapter06;

public class Student {
	static int schoolId = 10;
	
	int age;  // 멤버 변수 -> 인스턴스가 생성된 후 
	String name;  // 멤버 변수 -> 인스턴스가 생성된 후
	
	static void staticPrint() {
		System.out.println("static");
	}
	
	void print() {
		System.out.println("instance");
	}
}
