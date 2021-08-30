package chapter9;
/**
 * 
 * monitor, keyboard, cpu - ��ǻ���� �������� �������(�� ��⺰�� �ٸ��� �����Ǵ�)
 * Desktop, Notebook
 */
public abstract class Computer {
	abstract void monitor();
	abstract void keyboard();
	abstract void cpu();
	
	void turnOn() {
		System.out.println("��ǻ�� ������ �մϴ�.");
	}
	
	void turnOff() {
		System.out.println("��ǻ�� ������ ���ϴ�.");
	}
}
