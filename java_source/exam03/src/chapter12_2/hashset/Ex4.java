package chapter12_2.hashset;

import java.util.TreeSet;
import java.util.Comparator;

public class Ex4 {
	public static void main(String[] args) {
		/** ������������ ���� �Ͻÿ�.. */
		/*
		Comparator<Integer> com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2) * -1;
			}
			
		};
		*/
		TreeSet<Integer> list = new TreeSet<>((Integer o1, Integer o2) -> o1.compareTo(o2) * -1);
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
