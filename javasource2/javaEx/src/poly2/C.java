package poly2;

public class C extends B {
	
	public C() {
		super(); // 컴파일러가 자동 추가 - 상위 클래스의 생성자 메서드 - B()
		System.out.println("C생성자");
	}
}
