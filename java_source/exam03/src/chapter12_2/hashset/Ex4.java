package chapter12_2.hashset;

import java.util.TreeSet;

public class Ex4 {
	public static void main(String[] args) {
		/** ������������ ���� �Ͻÿ�.. */
		
		TreeSet<Integer> list = new TreeSet<>();
		/**
		 * Integer -> ������ ���� ���� �Ǿ� �ִ�(��������)
		 */
		list.add(Integer.valueOf(200));
		list.add(Integer.valueOf(100));
		list.add(Integer.valueOf(300));
		list.add(Integer.valueOf(400));
		
		for(Integer num : list) {
			System.out.println(num);
		}
	}
}
