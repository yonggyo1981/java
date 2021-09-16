package chapter9_4;

public class Ex1 {
	AbstractEx ex2 = new AbstractEx() {
		int add(int num1, int num2) {
			return num1 + num2;
		}
	};
	
	public static void main(String[] args) {
		/**
		 * 1) ���� ���� Ŭ����(�͸� ���� Ŭ����) - �޼��� ������ �ν��Ͻ� ����  
		 * 2) Ŭ������ ����
		 * + �� ������ �κ��� ���� �����ν� 
		 * �ν��Ͻ� ���� ����
		 */
		int num3 = 30; // �������� -> main �Լ� ȣ�� -> ���� -> ���� -> ����
		// ���� ���� Ŭ�������� ����ϴ� �������� -> �׻� ���� �����ϰ� ����
		// ���ȭ �Ǿ� -> ������ ������ ���� �ְ� �ȴ�.(public final -> �����Ϸ��� �ڵ����� �߰�)
		AbstractEx ex1 = new AbstractEx() { // �� ���� 
			int add(int num1, int num2) {
				return num1 + num2 + num3;
			}
		};
		
		System.out.println(ex1.add(10, 20));
		
		Ex1 ex = new Ex1();
		System.out.println(ex.ex2.add(20, 30));
	}
}
