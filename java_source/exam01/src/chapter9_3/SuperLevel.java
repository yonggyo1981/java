package chapter9_3;

public class SuperLevel extends PlayerLevel {

	@Override
	void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	void jump() {
		System.out.println("����!");
	}

	@Override
	void turn() {
		System.out.println("�ڵ���!");
	}

	@Override
	void showLevelMessage() {
		System.out.println("����� ���� �Դϴ�.");
	}
}
