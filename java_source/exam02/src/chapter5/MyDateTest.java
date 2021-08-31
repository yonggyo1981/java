package chapter5;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date = new MyDate();
		//date.year = 2021;
		//date.month = -1;
		//date.day = -20;
		
		date.setYear(2021);
		date.setMonth(-1);
		date.setDay(-20);
		
		date.showDate();
	}
}
