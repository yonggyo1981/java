package chapter04;

public class Ex06 {
	public static void main(String[] args) {
		do {
			System.out.println("�ݺ��Ǵ� ����");
		} while(false);
		
		int num = 1;
		int result = 0;
		do {
			result += num;
			num++;
		} while(num <= 100);
		System.out.println(result);
	}
}
