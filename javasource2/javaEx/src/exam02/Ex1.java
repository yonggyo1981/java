package exam02;

public class Ex1 {
	public static void main(String[] args) {
		/**
		 * %s -> ���ڿ� ġȯ
		 * %d -> ���� ġȯ
		 * %f -> �Ǽ� ġȯ
		 * %n -> �� ���� ����
		 */
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.printf("%d + %d = %d%n", num1, num2, result);
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
