package chapter8_1;

public class Ex1Test {
	public static void main(String[] args) {
		B b = new B();
		C c = new C(); 
		
		A bb = new B(); // AŬ������ �ν��Ͻ� + B Ŭ������ �ν��Ͻ� + C Ŭ������ �ν��Ͻ�
		A aa = new C(); // AŬ������ �ν��Ͻ� + B Ŭ������ �ν��Ͻ� + C Ŭ������ �ν��Ͻ�
								// C, B, A �ڷ���
		//C cc = (C)aa; // �ٿ� ĳ����
	
		System.out.println(aa instanceof A);
		System.out.println(aa instanceof B);
		System.out.println(aa instanceof C);
		
	}
}
