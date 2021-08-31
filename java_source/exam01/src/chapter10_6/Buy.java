package chapter10_6;

public interface Buy {
	void buy();
	
	default int getPrice() {
		description();
		privateMethod();
		return 10000;
	}
	
	default void showInfo() {
		System.out.println("Buy �������̽�");
	}
	
	static void description() {
		System.out.println("Buy �������̽�");
	}
	
	private void privateMethod() {
		System.out.println("Buy �������̽� ���ο����� ���� ����");
	}
	
}
