package chapter11_3;

import java.util.HashSet;

class Book {
	private int num;
	private String title;
	
	public Book(int num, String title) {
		this.num = num;
		this.title = title;
	}
	
	public int hashCode() {
		return num;
	}
	
	public boolean equals(Object obj) { // Book �ν��Ͻ� 
		Book book = (Book)obj;
		if (book.num == num) {
			return true;
		}
		
		return false;
	}
	
	public String toString() {
		return "��ȣ : " + num + ", ���� : " + title;
	}
}


public class Ex1 {
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<>();
		/**
		 * Set 
		 *  �ߺ� ���� - equals, hashCode -> Object -> �ν��Ͻ��� �ּ�
		 */
		/*
		list.add(new Book(100, "å1"));
		list.add(new Book(101, "å2")); // �ּҰ� �ٸ��� ������ ��� �ٸ� ������ �ν�
		list.add(new Book(102, "å3"));
		list.add(new Book(100, "å1"));
		
		for(Book book : list) {
			System.out.println(book);
		}
		*/

		list.add(new String("ABC"));
		list.add(new String("DEF"));
		list.add(new String("GHI"));
		list.add(new String("ABC"));
		
		for (String s : list) {
			System.out.println(s);
		}

	}
}
