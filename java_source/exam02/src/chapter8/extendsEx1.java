package chapter8;

public class extendsEx1 {
	public static void main(String[] args) {
		//B b = new B();
		C c = new C(); // C�� B, A �ڷ����� �� ���� �ִ�
		System.out.println(c instanceof B);
		System.out.println(c instanceof A);
	
		// ����Ŭ���� -> ���� Ŭ������ ����ȭ -> ���������� ���� -> ��ĳ����
		B d = new C();
		A e = new C();
		
		// ���� Ŭ���� ����ȯ -> ����Ŭ���� ���� -> ��������� ����ȯ -> �ٿ�ĳ����
		C f = (C)e;
		
	}
}
