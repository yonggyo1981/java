package chapter10_2;

public interface Calc {
	int ERROR = -1; // �����Ͻ� public static final �ڵ� �߰� - static ��� 
	/*
	 * �������̽��� only �߻� �޼��� -> �˾Ƽ� �����Ϸ��� �߰�(����)
	 *  
	 */
	int add(int num1, int num2); // public abstract �ڵ� �����Ϸ��� �߰��� �ش�
	int subtract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
