package chapter11_4;

public class Ex1 {
	public static void main(String[] args) {
		String text1 = new String("ABC"); // ��
		String text2 = new String("ABC"); // �� 
		System.out.println(text1 == text2); // == -> �ּ� -> X 
		
		String text3 = "ABC"; // text3 -> ������ �޸� ����
		String text4 = "ABC"; // text4 -> ������ �޸� ����
		

		System.out.println(text3 == text3);
	}
}
