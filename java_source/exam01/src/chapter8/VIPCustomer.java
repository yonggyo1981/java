package chapter8;

public class VIPCustomer {
	private int CustomerID; // ����ȣ
	private String CustomerName; // �� �̸� 
	private String customerGrade; // �� ���  VIP 
	private int bonusPoint; // ������
	private double bonusRatio; // 5%
	private double discountRatio; // ��ǰ ���� 10%
	private int agentID;  // ���� ���� ID 
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		discountRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}

	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}

	public int calcPrice(int price) {
		int bonus = (int)(price * bonusRatio); //���� ������ ���� ������
		bonusPoint += bonus;
		
		int discount = (int)(price * discountRatio);
		
		return price - discount;
	}
	
	public void showInfo() {
		System.out.println(CustomerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.");
	}
	
	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
