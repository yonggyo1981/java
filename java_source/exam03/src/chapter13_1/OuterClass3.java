package chapter13_1;

public class OuterClass3 {
	public InnerAbstractClass outerMethod(int num) {
		class InnerClass extends InnerAbstractClass {
			public void innerMethod() {
				// num -> public final int num -> ���ȭ
				//num = 100;
				System.out.println("num : " + num);
				System.out.println("���� ���� Ŭ���� �޼���");
			}
		}
		
		InnerClass in = new InnerClass();
		return in;
	}
}
