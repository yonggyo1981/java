package chapter10_5;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("�����ȭ�� ������� ����");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("����� ���� �ʰų�, ���� ª�� ��⿭�� �������� ����");
	}

}
