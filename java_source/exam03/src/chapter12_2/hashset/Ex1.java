package chapter12_2.hashset;

import java.util.HashSet;

public class Ex1 {
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<>();
		
		/**
		 *  String Ŭ���� - equals, hashCode  ������
		 * 
		 */
		String name1 = new String("�̸�1");
		String name2 = new String("�̸�2");
		String name3 = new String("�̸�3");
		String name4 = new String("�̸�1"); 
		list.add(name1);
		list.add(name2);
		list.add(name3);
		list.add(name4);
		
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name4));
		
		// hashCode, equals
		System.out.println(name1.equals(name4));
		System.out.println(name1.hashCode());
		System.out.println(name4.hashCode());
		
		
		for (String s : list) {
			System.out.println(s);
		}
	}
}
