package chapter08_1;

public class Ex1 {
	public static void main(String[] args) {
		Animal human = new Human();
		Human human2 = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		
		human.move();
		tiger.move();
		eagle.move();
		
		human.eat("��");
		human.name = "�̸�1";
		human2.name = "�̸�2";
		human2.eat("����");
	}
}
