package chapter7_1;

import java.util.ArrayList;

public class ArrayEx10 {
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("å1", "����1"));
		library.add(new Book("å2", "����2"));
		library.add(new Book("å3", "����3"));
		/*
		for (int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		*/
		for (Book book : library) {
			book.showBookInfo();
		}
	}
}
