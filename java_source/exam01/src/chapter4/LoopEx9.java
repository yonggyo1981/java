package chapter4;

public class LoopEx9 {
	public static void main(String[] args) {
		// 1-9단, 각 단은 1~9까지 곱한다
		for (int i = 1; i <= 9; i++) { // 각 1~9단
			for (int j = 1; j <= 9; j++) {
				System.out.println( i + " X " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}
