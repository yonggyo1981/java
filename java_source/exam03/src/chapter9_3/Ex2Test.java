package chapter9_3;

abstract class Ex2 {
	int numA = 10;
	final void method() {
		
	}
}

public class Ex2Test extends Ex2 { // Ex2Test �ν��Ͻ�, Ex2 �ν��Ͻ�
	final static int num = 20;
	public void method2() {
		
	}
	public static void main(String[] args) {
		Ex2 ex = new Ex2Test();
		//num = 30;
	}
}
