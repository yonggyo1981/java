package chapter7;

public class ArrayEx5 {
	public static void main(String[] args) {
		int[][] nums = { {1,2,3,4}, {5,6,7,8} };
		
		/**
		 * i, j, k, l, m, n, o ......
		 */
		
		for (int i = 0; i < nums.length; i++) {  // 1��, 2�� 
			for (int j = 0; j < nums[i].length; j++) { // i���� j��° ��
				System.out.println(nums[i][j]); // i�� j ��
			}
			System.out.println();
		}
	}
}
