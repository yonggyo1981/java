package chapter6_2;

public class TransTest {
	public static void main(String[] args) {
		Student<Bus> s1 = new Student<Bus>("�л�1", 5000);
		Student<Bus> s2 = new Student<Bus>("�л�2", 10000);
		
		Bus bus100 = new Bus("100", 1450);
		
		s1.ride(bus100);
		s2.ride(bus100);
		
		s1.showInfo();
		s2.showInfo();
		
		bus100.showInfo();
		/*
		Subway subIncheon = new Subway("��õ��Ʈ��2ȣ��", 1450);
		s1.ride(subIncheon);
		s2.ride(subIncheon);
		
		subIncheon.showInfo();
		*/
	}
}
