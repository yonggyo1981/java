package inheritance;

public class C extends B {
	int numC = 30;
	/**
	 * 1. ������ �޼����� ���� �߿��� ����
	 * 
	 */
	public C() {
		super(); // ���� Ŭ������ ������ ȣ��(�����Ͻÿ� �ڵ� �߰�)
		System.out.println("C������!");
	}
}
