package chapter12_2;

public class Calculator {
	// T, K -> Object -> ���ԵǴ� ���� ������ �� ����.... Number Ŭ������ ���
	// T, k (Object) -> Number 
	public static<T,K> double sum(T num1, K num2) {
		double n1 = 0;
		if (num1 instanceof Number) {
			n1 = ((Number)num1).doubleValue();
		}
		
		double n2 = 0;
		if (num2 instanceof Number) {
			n2 = ((Number)num2).doubleValue();
		}
		
		return n1 + n2;
	}
}
