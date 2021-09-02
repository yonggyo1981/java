package chapter11;

public class ObjectTest2 {
	public static void main(String[] args) {
		Book book1 = new Book("�ڹ����α׷��� �Թ�", 22000);
		Book book2 = new Book("�ڹ����α׷��� �Թ�", 22000);
		Book book3 = book2; // book3�� book2�� ���� ��(�ν��Ͻ��� �ּ�)
		//System.out.println("book1 �ּ�(hashcode) : " + book1.hashCode());
		//System.out.println("book1 �ּ�(System.identityHashCode) : " + System.identityHashCode(book1));
		//System.out.println(book1.equals(book2));
		//System.out.println(book3.equals(book2));
		
		String text1 = new String("ABC");
		String text2 = new String("ABC");
		System.out.println("text1 hashCode : " + text1.hashCode());
		System.out.println("text1 identityHashCode : " + System.identityHashCode(text1));
		//System.out.println("text2 : " + System.identityHashCode(text2));
		
		//System.out.println("equals : " + text1.equals(text2)); // ==
		//System.out.println("�ּ� == : " + (text1 == text2));
		
		
		//Integer num1 = new Integer(100);
		//Integer num2 = new Integer(100);
		Integer num1 = Integer.valueOf(100);
		Integer num2 = Integer.valueOf(100);
		int num11 = num1.intValue();
		Integer num111 = Integer.valueOf(num11);
		int num12 = Integer.parseInt("100");
		
		System.out.println("num1 hashCode : " + num1.hashCode());
		System.out.println("num1 System.identityHashCode : " + System.identityHashCode(num1));
		
		System.out.println("num2 hashCode : " + num2.hashCode());
		System.out.println("num2 System.identityHashCode : " + System.identityHashCode(num2));
		
		//System.out.println("equals : " + num1.equals(num2));
		//System.out.println("�ּ� == : " + (num1 == num2));
	}
}
