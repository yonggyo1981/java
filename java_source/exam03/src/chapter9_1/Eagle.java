package chapter9_1;

public class Eagle extends Bird {

	@Override
	void hatch() { // Bird �߻� �޼��� 
		System.out.println("Eagle Hatch");
	}

	@Override
	void move() { // Animal 
		System.out.println("�������� ���ƴٴմϴ�.");
	}

}
