package chapter12_2.hashset;

import java.util.TreeSet;

public class Ex2 {
	public static void main(String[] args) {
		TreeSet<String> list = new TreeSet<>();
		list.add(new String("이름1"));
		list.add(new String("이름3"));
		list.add(new String("이름2"));
		list.add(new String("이름4"));
		
		for (String s : list) {
			System.out.println(s);
		}
	}
}
