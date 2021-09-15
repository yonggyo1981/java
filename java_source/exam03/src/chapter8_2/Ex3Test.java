package chapter8_2;

import java.util.ArrayList;

public class Ex3Test {
	public static void main(String[] args) {
		Human human = new Human(); // Human �ν��Ͻ� + Animal  �ν��Ͻ�, Human, Animal �ڷ��� 
		Tiger tiger = new Tiger(); // Tiger �ν��Ͻ� + Animal �ν��Ͻ� Tiger, Animal �ڷ���
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(human);
		list.add(tiger);
		
		for (Animal animal : list) {
			animal.move();
			if (animal instanceof Human) {
				Human human1 = (Human)animal; // �ٿ� ĳ����
				human1.readBook();
			} else if (animal instanceof Tiger) {
				Tiger tiger1 = (Tiger)animal;
				tiger1.hunting();
			}
		}
		
	}
}
