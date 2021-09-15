package chapter8_3;

import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;

public class Ex1 {
	public static void main(String[] args) {
		Collection<String> list1 = new ArrayList<String>();
		list1.add("�׽�Ʈ1");
		list1.add("�׽�Ʈ2");
		list1.add("�׽�Ʈ1");
		
		Collection<String> list2 = new HashSet<String>();
		list2.add("�׽�Ʈ1");
		list2.add("�׽�Ʈ2");
		list2.add("�׽�Ʈ1");
		
		System.out.println("------------ list1 --------------");
		for (String s : list1) {
			System.out.println(s);
		}
		
		System.out.println("------------- list2 --------------");
		for(String s : list2) {
			System.out.println(s);
		}
	}
}
