package chapter9_3;

public class BeginnerLevel extends PlayerLevel {

	@Override
	void run() {
		System.out.println("õõ�� �޸���.");		
	}

	@Override
	void jump() {
		System.out.println("���� X");
	}

	@Override
	void turn() {
		System.out.println("�ڵ��� X");
	}

	@Override
	void showLevelMessage() {
		System.out.println("�ʺ��� ���� �Դϴ�.");
	}

}
