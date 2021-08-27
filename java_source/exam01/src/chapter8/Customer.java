package chapter8;



public class Customer  {
	protected int CustomerID; // ����ȣ
	protected String CustomerName; // �� �̸� 
	protected String customerGrade; // �� ���  SILVER 
	protected int bonusPoint; // ������
	protected double bonusRatio; // 1%
	
	/*
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer ������");
	}
	*/
	public Customer(int CustomerID, String CustomerName) {
		this.CustomerID = CustomerID;
		this.CustomerName = CustomerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	public int calcPrice(int price) {
		int bonus = (int)(price * bonusRatio); //���� ������ ���� ������
		bonusPoint += bonus;
		
		return price;
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
