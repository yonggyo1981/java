package chapter11_6;

public class Book {
	private String title; // 책제목
	private int price; // 판매가 
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "제목 : " + title + ", 판매가 : " + price;
	}
}
