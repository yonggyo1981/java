package chapter12_3;

import java.util.*;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Book> list = new TreeSet<>();
		list.add(new Book("����2", "����2", 20000));
		list.add(new Book("����3", "����3", 30000));
		list.add(new Book("����1", "����1", 10000));
		list.add(new Book("����2", "����2", 20000));
		
		for(Book book : list) {
			System.out.println(book);
		}
	}
}
