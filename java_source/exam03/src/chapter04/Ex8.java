package chapter04;

public class Ex8 {
	public static void main(String[] args) {
		parent : for (int i = 1; i <= 9; i++) { // 1�� ~ 9��
			/*
			if (i > 5) {
				break; // �ݺ��� �ߴ�
			}
			*/
			// ¦�� �ܸ� -> Ȧ�� �� -> �ǳ� �ٱ�
			/*
			if (i % 2 == 1) { // 2�� ���� �������� 1 -> Ȧ�� -> �ǳʶٱ�
				continue;
			}
			*/
			System.out.println("---- " + i + "�� ----");
			for (int j = 1; j <= 9; j++) {
				if (j % 2  == 0) continue parent;
				
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
	}
}
