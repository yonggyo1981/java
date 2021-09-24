package chapter12_2.treemap;

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Comparator;

public class Ex1 {
	public static void main(String[] args) {
		/**
		 * Integer - ������ ������ �̹� ����(Comparable - compareTo)
		 * 			  - ��������
		 *           - final Ŭ���� - ��� �Ұ�, compareTo ������ �Ұ�
		 *           - java.util.Comparator, int compare
		 *           @Functional Interface -> ���ٽ�
		 */
		
		Comparator<Integer> com = new Comparator<>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2) * -1;
			}
		};
		
		
		//TreeMap<Integer, String> list = new TreeMap<>(com);
		TreeMap<Integer, String> list = new TreeMap<>((Integer o1, Integer o2) -> o1.compareTo(o2) * -1);
		list.put(1002, "�̸�3");
		list.put(1000, "�̸�1");
		list.put(1001, "�̸�2");
		list.put(1003, "�̸�4");
		
		Iterator<Integer> ir = list.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			String value = list.get(key);
			System.out.println("���̵� : " + key + ", �̸� : " + value);
		}
		
	}
}
