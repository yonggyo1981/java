package chapter8;

import java.util.ArrayList;

public class CustomerTest3 {
	public static void main(String[] args) {
		// �迭 - �����ڷ����� ���ӵ� ����
		
		Customer c1 = new Customer(1000, "��1");
		VIPCustomer2 vc = new VIPCustomer2(1001, "��2", 1000); // Customer �ν��Ͻ�, VIP2Customer �ν��Ͻ�
		GoldCustomer gc = new GoldCustomer(1002, "��3"); // Customer �ν��Ͻ�, GoldCustomer �ν��Ͻ�
		/*
		Customer[] list = new Customer[3];
		
		list[0] = c1;
		list[1] = vc;
		list[2] = gc;
		*/
		

		ArrayList<Customer> list = new ArrayList<Customer>();
		list.add(c1);
		list.add(vc);
		list.add(gc);
		 
		for (Customer customer : list) {
			customer.showInfo();
			if (customer instanceof VIPCustomer2) {
				VIPCustomer2 vip = (VIPCustomer2)customer;
				System.out.println("AgentID : " + vip.getAgentID());
			}
		}
		
	}
}
