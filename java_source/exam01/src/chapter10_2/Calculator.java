package chapter10_2;

/**
 * ���� �ذ� ���
 *  1) �߻�Ŭ������ ����(abstract)
 *  2) �̱����� �߻�޼��带 ����
 */
public class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// int - 0 -> ������� 0���� ������ ������ ���� �߻� 
		if (num1 == 0 || num2 == 0) {
			return Calc.ERROR;
		} else {
			return num1 / num2;
		}
	}
	
	public void showInfo() {
		System.out.println("�Ϲ� ����");
	}
}
