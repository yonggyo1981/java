package chapter11_5;

public class Ex2 {
	public static void main(String[] args) {
		int num1 = 10;
		Integer num2 = Integer.valueOf(20);
		
		int result = num1 + num2; // Integer num2 -> int num2 (��ڽ�)
		System.out.println(result);
		
		Integer num3 = num1; // int num1  -> Integer num1 (����ڽ�)
	}
}
