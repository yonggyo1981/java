package chapter11_6;

public class Book {
	public String title; // å����
	public int price; // �ǸŰ� 
	
	public Book() {}
	
	 public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "���� : " + title + ", �ǸŰ� : " + price;
	}
}
