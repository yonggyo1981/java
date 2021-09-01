package chapter6;

public class Company {
	private static Company instance = new Company();
	private Company() {}; // �ܺ� ���� �Ұ�
	
	public static Company getInstance() {
		if (instance == null) {
			instance = new Company();
		}
		
		return instance;
	}
}
