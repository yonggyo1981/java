package chapter11;

public class Book {
	private String title;
	private int price;
	
	Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	public String toString() {
		return "å ���� : " + title + ", �ǸŰ� : " + price;
	}
}
