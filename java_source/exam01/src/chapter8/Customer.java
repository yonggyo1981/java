package chapter8;

public class Customer {
	private int CustomerID; // ����ȣ
	private String CustomerName; // �� �̸� 
	private String customerGrade; // �� ���
	private int bonusPoint;
	private double bonusRatio;
	
	public Customer() {
		
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
