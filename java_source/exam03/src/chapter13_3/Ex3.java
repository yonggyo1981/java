package chapter13_3;

import java.util.Arrays;

public class Ex3 {
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4,5,6,7,8,9,10};
		
		int total = Arrays.stream(nums).reduce(0, (a, v) -> a + v);
		System.out.println(total);
	}
}
