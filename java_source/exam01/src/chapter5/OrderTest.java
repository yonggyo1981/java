package chapter5;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		order.setOrder(201803120001L, "abc123", "2018�� 3�� 12��", "ȫ���", "PD0345-12", "����� �������� ���ǵ��� 20����");
		order.showInfo();
	}
}