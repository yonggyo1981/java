package chapter11_2;

public class StringEx2 {
	public static void main(String[] args) {
		String text1 = "ABC"; // ���ڿ� ���
		String text2 = "ABC";
		String text22 = "DEF";
		System.out.println(text1 == text2);
		System.out.println(text2 == text22);
		String text3 = new String("ABC"); // ��� -> ���� �Ұ�(���� �ּҿ� ���� ���ڿ�)
		String text4 = new String("ABC");
		System.out.println(text3 == text4);
	}
}
