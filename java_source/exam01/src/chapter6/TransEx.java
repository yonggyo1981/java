package chapter6;

public class TransEx {
	public static void main(String[] args) {
		Student st1 = new Student("�л�1", 10000);
		Student st2 = new Student("�л�2", 8000);
		
		Bus bus66 = new Bus(66, 1250);
		
		st1.rideBus(bus66); // �л�1��  66�� ������ ž�� 
		st2.rideBus(bus66); // �л�2�� 66�� ������ ž��
		
		st1.showInfo();
		st2.showInfo();
		
		bus66.showInfo();
		
		Subway sub = new Subway("��õ2ȣ��", 1250);
		st1.rideSubway(sub);
		st2.rideSubway(sub);
		
		st1.showInfo();
		st2.showInfo();
		
		sub.showInfo();
	}
}
