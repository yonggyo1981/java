package chapter13_1;

public class OuterClass {
	class InnerClass {
		public int innerNum = 100;
		public static int innerStaticNum = 100; // ���� 
		
		public void innerMethod() {
			System.out.println("�ν��Ͻ� ���� Ŭ���� �޼���");
		}
		
		public static void innerStaticMethod() { // ����
			System.out.println("�ν��Ͻ� ���� Ŭ���� ���� �޼���");
		}
	}
	
	public static void staticMethod() {
		System.out.println("�ܺ� Ŭ���� ���� �޼���");
	}
}
