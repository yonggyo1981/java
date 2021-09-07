package chapter13_1;

public class OuterClass {
	public int num = 10;
	private static int snum = 20;

	class InnerClass {
		int inNum = 10;
		static int inSNum = 20; // ����- jdk 15 ����, jdk16 �̻� - ���� X
		
		void innerMethod() {
			System.out.println("OuterClass num : " + num);
			System.out.println("OuterClass snum : " + snum);
			System.out.println("InnerClass inNum : " + inNum);
			System.out.println("InnerClass inSnum : " + inSNum);
		}
		
		static void innerStaticMethod() { // jdk15 ���� ����, jdk 16 �̻� ���� X  
			System.out.println("static �޼���");
		}
	}
}
