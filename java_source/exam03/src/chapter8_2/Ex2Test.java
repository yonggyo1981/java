package chapter8_2;

public class Ex2Test {
	public static void main(String[] args) {
		Animal human = new Human(); // Human �ν��Ͻ� + Animal �� �ν��Ͻ�
		Animal tiger = new Tiger(); // Tiger �ν��Ͻ� + Animal �ν��Ͻ�
		
		Animal[] animals = new Animal[2];
		animals[0] = human;
		animals[1] = tiger;
		//humans[0] = new Tiger();
		
		
	}
}
