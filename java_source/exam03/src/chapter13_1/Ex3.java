package chapter13_1;

public class Ex3 {
	public static void main(String[] args) {
		OuterClass3 out = new OuterClass3();
		
		/** 
		 * outerMethod�� ȣ�� -> Stack -> ���� -> ��ȯ�ϰ� -> ����
		 * num -> ���� 
		 * in -> new InnerClass() - Heap -> ������ outerMethod�� �������� num�� ���������� 
		 * ��� -> num�� ���ŵ��� �ʾҴ�...
		 *  ���� X -> ������ ���� 
		 *  ���� ���� Ŭ�������� ���� ������ ����, ��� -> ���ȭ�� �ȴ�
		 *  public final ... �ڵ����� �߰� �ȴ�
		 */
		InnerAbstractClass in = out.outerMethod(100);
		in.innerMethod();
	}
}
