package chapter7_1;

import java.util.Objects;

public class BookTest {
	public static void main(String[] args) {
		Book[] books = new Book[4]; // Book �ν��Ͻ��� ������� �� ���� 4�� 
		books[0] = new Book(100, "å1"); // �ν��Ͻ��� �ּ�
		books[1] = new Book(101, "å2"); 
		books[2] = new Book(102, "å3");
		books[3] = new Book(103, "å4");
		
		Book[] books2 = new Book[4];
		//System.arraycopy(books, 0, books2, 0, 4);
		for (int i = 0; i < books2.length; i++) {
			books2[i] = new Book(books[i].getBookNo(), books[i].getTitle());
		}
		
		
		
		System.out.println("----- books -----");
		// �迭 ������ ���� -> ������ �ν����� �ּ�
		books[0].setBookNo(104);
		books[0].setTitle("å5");
		for (int i = 0; i < books.length; i++) {
			//books[i].showInfo();
		}
		
		System.out.println("---- books2 -----");
		for (int i = 0; i < books2.length; i++) {
			//books2[i].showInfo();
		}
		
		for (Book book : books2) {
			book.showInfo();
		}
	}
}
