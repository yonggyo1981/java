package chapter10_6;

public class Customer implements Buy, Sell {
	@Override
	public void buy() {
		System.out.println("Buy �޼���");
	}

	@Override
	public void sell() {
	
		
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return Buy.super.getPrice();
	}

	@Override
	public void showInfo() {
		System.out.println("Customer Ŭ����");
	}
}
