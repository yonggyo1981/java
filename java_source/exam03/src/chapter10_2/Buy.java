package chapter10_2;

public interface Buy {
	int num = 30; // �����Ͻÿ� �߰� ���� ��� public static final 
	void buy(); // public abstract 
	
	default void order() {
		System.out.println("Buy - order�޼���");
		privateMethod();
	}
	
	static void showInfo() {
		System.out.println("static Buy!");
	}
	
	private void privateMethod() {
		System.out.println("private �޼���");
	}
}
