package chapter9_1;

public abstract class Animal {
	public String text = "Animal";
	
	abstract void move(); // ���� �κ��� ������ ���������� ������ �ϸ� �ȴ� 
	
	void showInfo() {
		System.out.println("Animal");
	}
}
