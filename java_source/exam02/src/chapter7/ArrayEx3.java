package chapter7;

public class ArrayEx3 {
	public static void main(String[] args) {
		Book[] books = new Book[3];  // Book ���� �ڷ��� �� ���� 4��
		Book[] books2 = new Book[3]; // books �� ������ �迭 

		books[0] = new Book("�ڹ����α׷��� �Թ�", 20000);
		books[1] = new Book("�����ͺ��̽� ���а� �ǽ�", 25000);
		books[2] = new Book("�������α׷� ����", 0);
		
		//System.arraycopy(books, 0, books2, 0, 3);
		for (int i = 0; i < books2.length; i++) {
			books2[i] = new Book(books[i].getName(), books[i].getPrice());
		}
		
		System.out.println("------ books ------");
		books[2].setName("���� ���� JSP");
		books[2].setPrice(18000);
		
		for (int i = 0; i < books.length; i++) {
			books[i].showInfo();
		}
		
		System.out.println("------ books2 ------");
		for (int i = 0; i < books2.length; i++) {
			books2[i].showInfo();
		}
		
		System.out.println("------ books2-1 ------");
		for (Book book : books) {
			book.showInfo();
		}
	}
}
