package chapter13_2;

@FunctionalInterface
interface MyInterface2 {
	void printString(String s);
}

public class Ex3 {
	public static void main(String[] args) {
		MyInterface2 my = s -> System.out.println(s);
		myPrintString(my);
		myPrintString(s -> System.out.println(s));
		MyInterface2 my2 = myPrintString2();
		my2.printString("���!");
	}
	
	public static void myPrintString(MyInterface2 my) {
		my.printString("�޼��� �μ��μ� ȣ��");
	}
	
	public static MyInterface2 myPrintString2() {
		//MyInterface2 my = s -> System.out.println(s);
		//return my;
		return s -> System.out.println(s);
	}
}
