package chapter15;

class Student2 {
	/**
	 * 1.�ν��Ͻ��� ���� 
	 * 2.��������� �ʱ�ȭ
	 * 3. ��ȯ�� X
	 */
	public Student2() { } // default ������ -> ������ �ɶ�
	
	
	
	public void print() {
		System.out.println("Stuent Class");
	}
}


public class Ex7 {
	public static void main(String[] args) {
		Student2 s1 = new Student2();
		s1.print();
	}
}
