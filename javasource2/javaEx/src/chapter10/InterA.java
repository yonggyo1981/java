package chapter10;

public interface InterA extends InterC, InterD {
	int numA = 20; // �����Ϸ��� �ڵ����� public static final 
	int sumA(int num1, int num2); // �����Ϸ��� �ڵ����� public abstract
	int sum(int num1, int num2);
	
	default int minus(int num1, int num2) {
		privatePrint();
		return num1 - num2;
	}
	
	public static void print() {
		System.out.println("�׽�Ʈ");
	}
	
	private void privatePrint() {
		System.out.println("private �׽�Ʈ - �������̽� ���ο�����");
	}
}
