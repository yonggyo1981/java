package chapter09_1;

public abstract class Car {
	public void start() {
		System.out.println("�õ��� �̴ϴ�.");
	}
	
	public abstract void drive();
	public abstract void off();
	
	public void stop() {
		System.out.println("���� ����ϴ�.");
	}
	
	final public void run() {
		start();
		drive();
		off();
		stop();
	}
}
