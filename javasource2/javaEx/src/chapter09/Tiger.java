package chapter09;

public class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("사냥~");
	}
}
