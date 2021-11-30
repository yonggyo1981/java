package chapter13_2;

import java.util.*;

interface PreInter2<T> {
	boolean test(T el, int index);
}

public class Ex3 {	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		
		ArrayList<String> newList = filter(list, (el, i) -> {
			return true;
		});
		System.out.println(newList);
	}
	
	public static ArrayList<String> filter(List<String> list, PreInter2<String> pre) {
		ArrayList<String> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (pre.test(list.get(i), i)) {
				list2.add(list.get(i));
			}
		}
		return list2;
	
	}
}
