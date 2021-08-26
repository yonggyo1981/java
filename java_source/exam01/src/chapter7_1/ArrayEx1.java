package chapter7_1;

public class ArrayEx1 {
	public static void main(String[] args) {
		//int[] nums = new int[4]; // int 자료형 공간 4개 - 빈 공간, 공간의 갯수 length 
		//int[] nums = new int[] {10, 20, 30, 40}; // int 자료형 4개 공간 생성후 값 대입, 초기화
		//int[] nums = {10,20,30,40};
		int[] nums;
		//nums = {10,20,30,40};
		nums = new int[] { 10, 20, 30, 40 };
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
