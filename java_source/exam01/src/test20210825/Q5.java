package test20210825;

public class Q5 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// ���� ������ ũ�� �ǳʶٱ�
				if (i > j) continue;
				System.out.println(i + "X" + j + "=" + (i * j));
			}
			System.out.println();
		}
	}
}
