package chapter4;

public class LoopEx9 {
	public static void main(String[] args) {
		// 1-9��, �� ���� 1~9���� ���Ѵ�
		for (int i = 1; i <= 9; i++) { // �� 1~9��
			for (int j = 1; j <= 9; j++) {
				System.out.println( i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
