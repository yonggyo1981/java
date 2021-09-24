package chapter13_3;

public class Book {
	private String bookName;
	private int price;
	
	public Book(String bookName, int price) {
		this.bookName = bookName;
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "å �̸� : " + bookName + ", �ǸŰ� : " + price;
	}
}
