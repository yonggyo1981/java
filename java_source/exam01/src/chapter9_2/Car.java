package chapter9_2;

public abstract class Car {
	void startCar() {
		System.out.println("���� �õ��� �̴ϴ�.");
	}
	
	abstract void drive();
	abstract void stop();
	
	void turnOff() {
		System.out.println("���� �õ��� ���ϴ�.");
	}
	
	final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
