package chapter8_1;

public class D extends C {
	int numD = 10;

	D() {
		System.out.println("D ������");
	}
	
	D(int numD) {
		super(numD); // C Ŭ���� ������ -> numC ���� �Ϸ��� super() ȣ�� �Ϸ� �ν��Ͻ��� ����
		this.numD = numD;
	}
	
	void methodD() {
		System.out.println("�޼��� D");
	}
}