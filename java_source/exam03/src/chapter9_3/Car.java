package chapter9_3;

public  abstract class Car {
	public abstract void drive(); // �Ϲ� �¿���(ManualCar -> ������ ����, ���� ������ -> AI �� ����)
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ� �ѱ�");
	}
	public void turnOff() {
		System.out.println("�õ� ����");
	}
	
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
