package chapter13_2;

public class Ex1 {
	public static void main(String[] args) {
		int num = 100;
		MyCalc calc = (x, y) ->  x + y; // �޼��� ���� 1 ���� ���� ���� 
		
		
		/*
		MyCalc calc = new MyCalc() {
			public int add(int num1, int num2) {
				return num1 + num2;
			}
		};
		*/
		
		System.out.println(calc.add(100, 200));
	}
}
