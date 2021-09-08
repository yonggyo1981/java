package chapter13_4;

import java.util.ArrayList;

public class Q7 {
	public static void main(String[] args) {
		ArrayList<Book> bookList = new ArrayList<>();
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		
		// ��� å�� ������ ��
		int total = bookList.stream().mapToInt(b -> b.getPrice()).sum();
		System.out.println("å�� ������ �� = " + total);
		
		// å�� ������ 20,000 �̻��� å�� �̸� -> ���� -> ���
		bookList.stream().filter(b -> b.getPrice() >= 20000)
								.map(b -> b.getName())
								.sorted()
								.forEach(s -> System.out.println(s));
	}
}
