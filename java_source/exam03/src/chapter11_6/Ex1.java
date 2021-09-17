package chapter11_6;

public class Ex1 {
	public static void main(String[] args) throws ClassNotFoundException  {
		/** 
		 * 1. Object Ŭ���� - getClass() 
		 * 2. ��� Ŭ�������� ���� ���� -> class -> Class �ν��Ͻ� ��ȯ 
		 */
		Book book = new Book("å1", 20000);
		Class cls = book.getClass();
		System.out.println(cls.getName());
		
		Class cls2 = Book.class;
		System.out.println(cls2.getName());
		
		Class cls3 = Class.forName("chapter11_6.Book");
		System.out.println(cls3.getName());
	}
}
