package chapter9_2;

public class CarTest {
	public static void main(String[] args) {
		AICar aicar = new AICar();
		ManualCar car = new ManualCar();
		System.out.println("--------- ���� ���� --------");
		aicar.run();
		
		System.out.println("-------- ����� ���� -----");
		car.run();
	}
}
