package chapter12_3.arraylist;

import java.util.ArrayList;
/** 
 *  �߰� - ���� ���� �߰� 
 *  ������ - pop -> ���� �ֱٿ� �߰��� ��� 
 */
public class Stack<T> {
	private ArrayList<T> dataList;
	
	public Stack() {
		dataList = new ArrayList<T>();
	}
	
	public void push(T data) {
		dataList.add(data);
	}
	
	public T pop() {
		int len = dataList.size() - 1;
		
		return dataList.remove(len);
	}
}
