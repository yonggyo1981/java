package chapter10_7;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		/**
		 *  ArrayList 
		 * 		.remove(�ε��� ��ȣ) -> ���ŵǸ� ���ŵ� ��Ҹ� ��ȯ
		 * 	    .remove(�ν��Ͻ�) -> ���� �Ǹ� ����(true, false)
		 *     .remove(�ν��Ͻ�, ��) -> ���ŵǸ� ����(true, false)
		 */	
		return shelf.remove(0);
	}

}
