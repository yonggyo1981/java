package chapter7_1;

public class ArrayEx7 {
	public static void main(String[] args) {
		int[][] nums = new int[2][3];
		// 1��° - �� - for
		// 2��° - �� - �� 
		for (int i = 0; i < nums.length; i++) { // ��
			System.out.println((i + 1) + "�� --------------");
			// �� ���� ��
			for (int j = 0;  j < nums[i].length; j++) { // �� ���� ��
				System.out.println(nums[i][j]); // i��° ���� j��° ��
			}
		}
	}
}
