package chapter2;

public class CastEx2 {
	public static void main(String[] args) {
		//int num1 = 200;
		//byte num2 = (byte)num1; // int -> byte
		//System.out.println(num2);
		
		//double num1 = 3.14; // 8
		//long num2 = (long)num1; // �ս� �߻�
		//System.out.println(num2);
		
		double num1 = 1.2;
		float num2 = 0.9F;
		int num3 = (int)num1 + (int)num2;  // num1 --> 1, num2 -- 0 == 1 
		int num4 = (int)(num1 + num2); // 1.2 + 0.9F -> 2.1(double) -> 2 
		
		System.out.println(num3);
		System.out.println(num4);
		
		
	}
}
