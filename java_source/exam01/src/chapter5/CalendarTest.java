package chapter5;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar cal = new Calendar();
		cal.setYear(2021);
		cal.setMonth(8);
		cal.setDay(24);
		
		System.out.println(cal.getYear() + "-" + cal.getMonth() + "-" + cal.getDay());
	}
}
