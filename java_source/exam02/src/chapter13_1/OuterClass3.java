package chapter13_1;

public class OuterClass3 {
		
	public InnerMyClass outerMethod(int num1, int num2) {
		int num = 20; // ���� ���� Ŭ���� �ܺο� ���ǵǾ� �ִ� ���� ���ȭ
		   					// public final -> ������ ����, ���� X
		
		return new InnerMyClass() {
			public void method() {
				System.out.println("���� ���� Ŭ����");
			}
		};
		/*
		InnerMyClass in = new InnerMyClass() {
			public void method() {
				System.out.println("���� ���� Ŭ����");
			}
		};
		
		return in;
		*/
		
		/*
		class InnerClass implements InnerMyClass {
			public void method() {
				//num = 30;

				System.out.println("���� ���� Ŭ����");
				System.out.println("num = " + num);
			}
		}
		
		InnerClass in = new InnerClass();
		
		return in;
		*/
	}
}
