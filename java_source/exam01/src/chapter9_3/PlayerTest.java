package chapter9_3;

public class PlayerTest {
	public static void main(String[] args) {
		Player player = new Player(); // �ʺ��� ����
		player.play(2);
		System.out.println();
		
		player.upgradeLevel(new AdvancedLevel());
		player.play(3);
		System.out.println();
		
		player.upgradeLevel(new SuperLevel());
		player.play(1);
	}
}
