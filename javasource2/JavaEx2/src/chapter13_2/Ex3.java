package chapter13_2;

import java.util.*;

interface PreInter2<T> {
	boolean test(T el, int index);
}

public class Ex3 {
	public static void main(String[] args) {
		Ex3 ex3 = new Ex3();
		ArrayList<String> list = new ArrayList<>();
		list.add("이름1");
		list.add("이름2");
		list.add("이름3");
		list.add("이름4");
		
		ArrayList<String> result = ex3.<String>filter(list, (el, i) -> {
			return true;
		});
		
		System.out.println(result);
	}
	

	public static <T> ArrayList<T> filter(List<T> list, PreInter2<T> pre) {
		ArrayList<T> list2 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (pre.test(list.get(i), i)) {
				list2.add(list.get(i));
			}
		}
		return list2;
	
	}
}
