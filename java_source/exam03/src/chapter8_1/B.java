package chapter8_1;

public class B extends A {
	int numB = 20;
	
	B() {
		super();
		//System.out.println("B ������");
	}
	
	void methodB() {
		System.out.println("�޼���B");
	}


	protected void method() {
		System.out.println("BŬ���� �޼���");
	}

}
