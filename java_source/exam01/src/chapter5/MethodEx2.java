package chapter5;

public class MethodEx2 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 2;
		divide(n1,n2);
		
	}
	
	static void divide(int num1, int num2) {
		if (num2 == 0) {
			return; // ��ȯ�ϰ�, �Լ��� ������ ����
		}
		
		int result = num1 / num2;
		System.out.println(result);
	}
}
