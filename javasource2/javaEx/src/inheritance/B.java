package inheritance;

public class B extends A {
	int numB = 10;
	public B() {
		super(); // ����Ŭ���� ������?A()
		System.out.println("B������");
	}
}
