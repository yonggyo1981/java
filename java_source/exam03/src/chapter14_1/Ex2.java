package chapter14_1;

public class Ex2 {
	public static void main(String[] args) {
		try {
			int num1 = 10;
			int num2 = 2;
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage()); // Throwable Ŭ������ ���ǰ� ���� �Ǿ� �ִ�
		} finally {
			System.out.println("������ ����!");
		}
		System.out.println("���� �ǳ���?");
	}
}
