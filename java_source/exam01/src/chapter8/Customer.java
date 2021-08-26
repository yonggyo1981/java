package chapter8;

public class Customer {
	private int CustomerID; // °í°´¹øÈ£
	private String CustomerName; // °í°´ ÀÌ¸§ 
	private String customerGrade; // °í°´ µî±Þ
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
