package chapter5_1;

public class Rice {
	private int amount; // ���� ��
	
	public Rice(int amount) {
		this.amount = amount;
	}
	
	public void eaten(int oneSpoon) {
		amount -= oneSpoon;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void showInfo() {
		System.out.println("���� ���� ���� �� = " + amount + "g");
	}
}
