package chapter12_1;

public class GenericOperator<T> {
	T num1;
	T num2;
	
	
	public<T, V> double add(T num1, V num2) {
		/**
		 * T, V -> ���ڴ� �´�. ��������, �Ǽ� ���� �˼� ����.
		 *        -> ����(Integer, Double, Float, Long .... )
		 *        ���� Wrapper �ڷ����� ������ -> Number Ŭ������ ��ӹް� �ִ�. 
		 */
		
		double num11 = ((Number)num1).doubleValue();
		double num22 = ((Number)num2).doubleValue();
		
		return num11 + num22;
		
	}
	
	public static<T, V> double addStatic(T num1, V num2) {
		/**
		 * T, V -> ���ڴ� �´�. ��������, �Ǽ� ���� �˼� ����.
		 *        -> ����(Integer, Double, Float, Long .... )
		 *        ���� Wrapper �ڷ����� ������ -> Number Ŭ������ ��ӹް� �ִ�. 
		 */
		
		double num11 = ((Number)num1).doubleValue();
		double num22 = ((Number)num2).doubleValue();
		
		return num11 + num22;
		
	}
	
}
