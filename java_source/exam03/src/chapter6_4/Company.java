package chapter6_4;

public class Company {
	/**
	 *  �ν��Ͻ��� ������ ������ 1���� ���� 
	 *  1. ������ -> private ���� ������(�ܺ� ���� X, ���ο����� ����)
	 *  2. ���ο��� �ν��Ͻ� ���� 
	 *  3. ���ο��� ������ �ν��Ͻ��� �ܺο��� ������ �� �ִ� �޼���(public ....)
	 *  4. �ܺο��� ���� �Ұ� -> ���� ���� Ŭ���������� �����Ҽ� �ִ� static �޼��� 
	 */
	
	private static Company instance = new Company();
	
	private Company() {} 
	
	public static Company getInstance() {
		return instance;
	}
}
