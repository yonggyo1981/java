package chapter8;

public class B extends A {
	int numB = 20;
	
	B() {
		//super(); //  A Ŭ������ �⺻ ������
		System.out.println("B ������");
	}
	
	void methodB() {
		System.out.println("methodB");
	}
}
