package chapter10_2;

public class Order implements Buy, Sell {
	public void buy() { //  ���������� -> ������ -> ���ü��� ����, ���� ���ü����� ū�ɷθ� ������
		System.out.println("Buy!");
	}
	
	public void sell() {
		System.out.println("Sell!");
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		Buy.super.order();
	}
}
