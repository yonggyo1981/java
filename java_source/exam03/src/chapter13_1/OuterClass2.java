package chapter13_1;

public class OuterClass2 {
	public int num = 100;
	public static int Num1 = 100;
	
	static class InnerClass {
		private int num2 = 10;
		public void innerMethod() {
			Num1 = 200;
			System.out.println("���� ���� Ŭ���� �޼���");
			num2 = 20;
		}
		
		public static void innerStaticMethod() {
		//	num2 = 200;
		//	innerMethod();
		}
	}
	
	public void outerMethod() {
		
	}
	
	public static void outerStaticMethod() {
		Num1 = 100;
	}
}
