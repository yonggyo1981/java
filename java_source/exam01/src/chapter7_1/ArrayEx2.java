package chapter7_1;

public class ArrayEx2 {
	public static void main(String[] args) {
		 // Book ���� �ڷ��� �ν��Ͻ� �ּҰ� ����� �� ���� 5��(�ʱⰪ�� null)
		Book[] library = new Book[5];
		
		library[0] = new Book("å�̸�1", "����1");
		library[1] = new Book("å�̸�2", "����2");
		library[2] = new Book("å�̸�3", "����3");
		
		for (int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
	}
}
