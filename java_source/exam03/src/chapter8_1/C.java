package chapter8_1;

public class C extends B {
	int numC = 30;
	
	C() {
		super();
		//System.out.println("C ������");
	}
	
	void methodC() {
		System.out.println("�޼���C");
	}
	
	@Override
	public void method() {
		System.out.println("C Ŭ������ �޼���");
	}
	
	int add(int num1, int num2) {
		return num1 + num2;
	}
}
