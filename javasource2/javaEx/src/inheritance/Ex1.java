package inheritance;

public class Ex1 {
	public static void main(String[] args) {
		// CŬ������ �ν��Ͻ�
		// Ŭ������� ���� �޼��� -> ������ �޼���
		C c = new C();
		A a = c; // 
		B b = c;
		
		D d = new D();
		A aa = d;
		if (aa instanceof D) {
			D cc = (D)aa;
		}
	}
}
