package chapter4;

public class LoopEx12 {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if (i % 2 == 0) { // ¦��
				continue;
			}
			System.out.println(i);
		}
		
		if ('A' < 'B') {
			System.out.println("B�� �� ũ��");
		} else {
			System.out.println("A�� �� ũ��");
		}
		/// A - 65
		// B - 66
		
	}
}
