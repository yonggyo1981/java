package chapter9;

/**
 * �������� ���� �޼��� ���� 
 * 				1) ��ӹ��� Ŭ������ �������� ���� �޼��带 ���� 
 *				2) ��ӹ��� Ŭ������ �߻� Ŭ������ ����
 */

public abstract class Notebook extends Computer {
	void monitor() {
		System.out.println("Notebook �����");
	}
		
	void cpu() {
		System.out.println("Notebook CPU");
	}
	
	void webcam() {
		System.out.println("Notebook Webcam");
	}
}
