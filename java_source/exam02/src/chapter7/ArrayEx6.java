package chapter7;

import java.util.ArrayList;

public class ArrayEx6 {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<Book>();
		
		books.add(new Book("�ڹ����α׷��� �Թ�", 20000));
		books.add(new Book("���̺��̽� ���а� �ǽ�", 25000));
		books.add(new Book("�������α׷� ����", 0));
		/*
		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			book.showInfo();
		}*/
		
		for (Book book : books) {
			book.showInfo();
		}
	}
}
