package chapter9_5;

import java.util.HashSet;

public class BookTest {
	public static void main(String[] args) {
		/**
		 * equals, hashCode() -> ��ġ 
		 * TreeSet 
		 */
		HashSet<Book> list = new HashSet<>();
		list.add(new Book(100, "å1"));
		list.add(new Book(101, "å2"));
		list.add(new Book(102, "å3"));
		list.add(new Book(100, "å1"));
		
		for (Book book : list) {
			System.out.println(book);
		}
	}
}
