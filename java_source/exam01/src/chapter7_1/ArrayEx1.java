package chapter7_1;

public class ArrayEx1 {
	public static void main(String[] args) {
		//int[] nums = new int[4]; // int �ڷ��� ���� 4�� - �� ����, ������ ���� length 
		//int[] nums = new int[] {10, 20, 30, 40}; // int �ڷ��� 4�� ���� ������ �� ����, �ʱ�ȭ
		//int[] nums = {10,20,30,40};
		int[] nums;
		//nums = {10,20,30,40};
		nums = new int[] { 10, 20, 30, 40 };
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
