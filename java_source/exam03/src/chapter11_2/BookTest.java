package chapter11_2;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("�ڹ� ���α׷��� �Թ�", 25000));
		books.add(new Book("�����ͺ��̽� �Թ�", 20000));
		
		for(Book book : books) {
			//book.showInfo();
			System.out.println(book); //
		}
	}
}
