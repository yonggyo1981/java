package chapter8;

public class CustomerTest {
	public static void main(String[] args) {
		System.out.println("-------------- SILVER �Ϲ� �� --------------");
		Customer customerLee = new Customer(); // ������ 1%, SILVER
		customerLee.setCustomerID(1000);
		customerLee.setCustomerName("�Ϲݰ��̸�1");
		customerLee.calcPrice(10000);
		customerLee.calcPrice(20000);
		customerLee.showInfo();
		
		System.out.println("-------------- VIP �� --------------");
		VIPCustomer2 customerKim = new VIPCustomer2(); // ������ 5%, VIP, ��ǰ ������ 10%
		customerKim.setCustomerID(1001);
		customerKim.setCustomerName("VIP ���̸�2");
		customerKim.setAgentID(1000);
		
		System.out.println("���� ���� �ǸŰ� : " + customerKim.calcPrice(50000));
		System.out.println("���� ���� �ǸŰ� : " + customerKim.calcPrice(100000));
		customerKim.showInfo();
	}
}
