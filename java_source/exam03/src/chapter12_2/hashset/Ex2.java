package chapter12_2.hashset;

import java.util.TreeSet;

public class Ex2 {
	public static void main(String[] args) {
		TreeSet<String> list = new TreeSet<>();
		list.add(new String("�̸�1"));
		list.add(new String("�̸�3"));
		list.add(new String("�̸�2"));
		list.add(new String("�̸�4"));
		
		for (String s : list) {
			System.out.println(s);
		}
	}
}
