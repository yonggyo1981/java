package chapter13_1;

public class OuterClass4 {
	InnerAbstractClass in = new InnerAbstractClass() {
		public void innerMethod() {
			System.out.println("���� ���� Ŭ����(����)");
		}
	};
	
	public InnerAbstractClass innerMethod() {
		
		return new InnerAbstractClass() { // �͸� ���� Ŭ����
			public void innerMethod() {
				System.out.println("���� ���� Ŭ����");
			}
		};
		
		
	}
}
