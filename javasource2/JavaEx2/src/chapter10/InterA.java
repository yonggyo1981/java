package chapter10;

public interface InterA {
	int numA = 20; // public static final 
	void methodA(); // public abstract 
	
	void commonMethod();
	
	default void instanceMethod() {
		System.out.println("�ν��Ͻ� �޼���");
	}
	
	static void staticMethod() {
		System.out.println("���� �޼���");
	}
	
	private void privateMethod() {
		System.out.println("private �޼���");
	}
}
