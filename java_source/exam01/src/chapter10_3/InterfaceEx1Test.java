package chapter10_3;

public class InterfaceEx1Test {
	public static void main(String[] args) {
		/**
		 * ex �ν��Ͻ��� A exA, B exB�� ���� ��Ҹ� ��� ������ �����Ƿ� 
		 * ������ �� ��ȯ����  
		 */
		InterfaceEx1 ex = new InterfaceEx1();
		A exA = ex; // ���������� A�� ����ȯ
		B exB = ex; // ���������� B�� ����ȯ 
		
	}
}
