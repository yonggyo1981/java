package chapter8_1;

public class Ex1Test {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		
		B bb = new C(); // A클래스의 인스턴스 + B 클래스의 인스턴스 + C 클래스의 인스턴스
		A aa = new C(); // A클래스의 인스턴스 + B 클래스의 인스턴스 + C 클래스의 인스턴스
		
		C cc = (C)aa; // 다운 캐스팅
	
	}
}
