package chapter05_06_1;

public class Book implements Cloneable {
	public String title;
	public int price;
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	public Book() {
		this("�⺻����", 10000);
	}
	
	public Book(String title, int price)  {
		
		// Book Ŭ������ �ν��Ͻ��� ����� �� ���� -> this -> ���� ������ �ν��Ͻ��� �ּ�
		this.title = title; // this.title -> ��� ����(��),  title -> ��������(����)
		this.price = price;
	}
	
	public void print() {
		System.out.printf("���� : %s, ���� : %d%n", this.title, this.price);
	}
}
