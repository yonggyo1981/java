package chapter11_6;

public class Book {
	private String title; // å����
	private int price; // �ǸŰ� 
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "���� : " + title + ", �ǸŰ� : " + price;
	}
}
