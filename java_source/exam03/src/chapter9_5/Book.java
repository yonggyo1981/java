package chapter9_5;

public class Book {
	

	public int num; // ������ȣ
	public String title; // ���� ���� 
	
	public Book(int num, String title) {
		this.num = num;
		this.title = title;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public int hashCode() {
		return num; // ���� ��ȣ
	}

	@Override
	public boolean equals(Object obj) {
		// ���� ��ȣ�� ������ -> �������� ����
		Book book = (Book)obj;
		if (book.getNum() == num) {
			return true;
		}
		
		return false;
	}
	@Override
	public String toString() {
		return "������ȣ : " + num + ", ��������: " + title;
	}
}
