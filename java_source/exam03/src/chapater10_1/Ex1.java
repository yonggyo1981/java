package chapater10_1;

public class Ex1 implements A, B { // �����佺 A, B -> Ex1 �ν��Ͻ� ���� ���� ���� 

	@Override
	public void methodA() {
		System.out.println("�޼��� A");
	}

	@Override
	public void methodB() {
		System.out.println("�޼��� B");
	}

	@Override
	public void methodC() {
		System.out.println("�޼��� C");
	}
}
