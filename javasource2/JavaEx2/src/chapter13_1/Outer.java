package chapter13_1;

public class Outer {
	public int outerNumA = 10;
	public static int OuterNumB = 20;
	
	class Inner { // ��� ������ ���� ����� Ư¡, Outer Ŭ������ �ν��Ͻ� ���� ���Ŀ� ����  
		public int numA = 10;
		public static int numB = 20; // 15���� ���ϴ� ��� �Ұ� 
		
		public void method() {
			System.out.println(outerNumA);
			System.out.println(OuterNumB);
		}
		
		public static void staticMethod() {
			//System.out.println(outerNumA);
			System.out.println("���� �޼���");
		}
	}
}
