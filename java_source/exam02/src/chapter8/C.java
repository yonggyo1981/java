package chapter8;

public class C extends B {
	int numC = 30;
	
	C() {
		// �����Ϸ��� �ڵ����� �߰� -> �θ� �⺻ ������ ȣ�� 
		// C() ������ ȣ���� ���� �Ǳ� ���� �θ� �����ڰ� ���� ȣ���
		//super(); 
		System.out.println("C ������");
	}
	
	void methodC() {
		System.out.println("methodC");
	}
}
