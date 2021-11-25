package chapter12_3;

public class Book {
	private static int serialNo;
	private int bookNo;
	private String title;
	private String author;
	private int price;
	
	public Book(String title, String author, int price) {
		bookNo = ++serialNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return "bookNo : " + bookNo + ", title : " + title + ", author : " + author + ", price : " + price;
	}
}
