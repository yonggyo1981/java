package chapter12_3.hashset;

import java.util.HashSet;

public class HashSetEx1 {
	public static void main(String[] args) {
		HashSet<String> list = new HashSet<>();
		list.add(new String("�̸�1"));
		list.add(new String("�̸�2"));
		list.add(new String("�̸�3"));
		list.add(new String("�̸�2"));
		
		for (String name : list) {
			System.out.println(name);
		}
	}
}
