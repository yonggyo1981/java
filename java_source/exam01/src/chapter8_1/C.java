package chapter8_1;

public class C extends B {
	int numC = 10;

	C() {
		System.out.println("C ������");
	}
	
	C(int numC) {
		//super(); // BŬ������ B() �⺻�����ڷ� �̵�
		this.numC = numC;
	}
	

	
	void methodC() {
		System.out.println("�޼��� C");
	}
}
