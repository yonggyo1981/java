package chapater10_1;

public class Ex1Test {
	public static void main(String[] args) {
		/*
		 * ex1 �ν��Ͻ� + A, B �������̽� -> ex1 -> Ex1, A, B 
		 */
		Ex1 ex1 = new Ex1(); // A, B �������̽��� ����,
			
		ex1.methodA();
		ex1.methodB();
		
		A a = ex1;
		
		B b = ex1;
	}
}
