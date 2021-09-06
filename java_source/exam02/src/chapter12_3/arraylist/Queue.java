package chapter12_3.arraylist;

import java.util.ArrayList;

/**
 *  enQueue -> ���� ���� �߰� 
 *  deQueue -> ���� �տ��� ���� ������
 */
public class Queue<T> {
	private ArrayList<T> dataList;
	
	public Queue() {
		dataList = new ArrayList<T>();
	}
	
	public void enQueue(T data) {
		dataList.add(data);
	}
	
	public T deQueue() {
		return dataList.remove(0);
	}
}
