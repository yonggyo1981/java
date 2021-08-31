package chapter5_1;

public class Person {
	String name;
	int oneSpoon;
	int stomach;
	
	public Person(String name, int oneSpoon) {
		this.name = name;
		this.oneSpoon = oneSpoon;
	}
	
	public void eat(Rice rice) {
		int amount = rice.getAmount();
		
		// ���� ���� ���� ���� 200g �̻��̸� ��ҷ��� �׸� �Ա�
		if (stomach >= 200) {
			System.out.println("��ҷ�");
			return;
		}
	
		// ���� ���� ���� ������ -> �������
		if (amount <= 0) {
			System.out.println("�����");
		} else {
			rice.eaten(oneSpoon);
			stomach += oneSpoon;
		}
		
		// ���� ��� ���� ���� �� 
		System.out.println("���� �� : " + stomach + "g, ���� �� : "  + rice.getAmount() + "g");
	}
}
