package chapter10;

public interface InterB {
	void methodB();
	void commonMethod();
	
	default void instanceMethod() {
		System.out.println("�ν��Ͻ� �޼���");
	}
}
