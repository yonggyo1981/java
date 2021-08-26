package chapter8;

public class VIPCustomer2 extends Customer {
	private double bonusRatio;
	private double discountRatio; // ��ǰ ������ 10%
	private int agentID; // ���� ���� ID 
	
	public VIPCustomer2() {
		bonusRatio = 0.05;
		customerGrade = "VIP";
		discountRatio = 0.1;
		
		System.out.println("VIPCustomer2 ������");
	}

	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) { // �޼��� �������̵�
		int bonus = (int)(price * bonusRatio); //���� ������ ���� ������
		bonusPoint += bonus;
		
		int discount = (int)(price * discountRatio);
		
		return price - discount;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("���� ID : " + agentID);
	}
}
