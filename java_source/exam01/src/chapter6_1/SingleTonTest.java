package chapter6_1;

public class SingleTonTest {
	public static void main(String[] args) {
		//SingleTon st1 = new SingleTon();
		//SingleTon st2 = new SingleTon();
		SingleTon s1 = SingleTon.getInstance();
		SingleTon s2 = SingleTon.getInstance();
		// s1, s2�� ������ �ν��Ͻ�, ������ �ּ�
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		System.out.println(s1 == s2);
	}
}
