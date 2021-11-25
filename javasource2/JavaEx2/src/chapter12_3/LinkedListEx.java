package chapter12_3;

import java.util.*;

public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Book> list = new LinkedList<>();
		list.add(new Book("����1", "����1", 10000));
		list.add(new Book("����2", "����2", 20000));
		list.add(new Book("����3", "����3", 30000));
		list.addFirst(new Book("����0", "����0", 5000));
		list.addLast(new Book("����4", "����4", 40000));
		
		for (Book book : list) {
			System.out.println(book);
		}
		
		Book bookFirst = list.getFirst();
		System.out.println(bookFirst);
	}
}
