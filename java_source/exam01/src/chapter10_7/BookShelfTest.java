package chapter10_7;

public class BookShelfTest {
	public static void main(String[] args) {
		BookShelf shelf = new BookShelf();
		shelf.enQueue("�ڹ����α׷��� �Թ�");
		shelf.enQueue("�����ͺ��̽� �̷а� ����");
		shelf.enQueue("���� ���� JSP");
		
		System.out.println(shelf.deQueue()); // �ڹ����α׷��� �Թ� ����
		System.out.println(shelf.deQueue()); // �����ͺ��̽� �̷а� ����
		System.out.println(shelf.deQueue()); // ���� ���� JSP
	}
}
