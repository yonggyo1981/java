package chapter5;

public class AccessEx1Test {
	public static void main(String[] args) {
		AccessEx1 ex1 = new AccessEx1();
		System.out.println(ex1.num1);
		
		System.out.println(ex1.num2);
		
		//System.out.println(ex1.num3);
		
		System.out.println(ex1.num4); // protected -> ���� ��Ű�������� ����(�ܺ� ,����)
	}
}
