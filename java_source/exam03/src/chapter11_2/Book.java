package chapter11_2;

public class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("������ : " + name + ", �ǸŰ� : " + price);
	}

	@Override
	public String toString() {
		return "������ : " + name + ", �ǸŰ� : " + price;
	}
}
