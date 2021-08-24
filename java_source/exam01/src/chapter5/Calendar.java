package chapter5;

public class Calendar {
	private int year;
	private int month;
	private int day;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMonth(int month) {
		if (month < 1) month =1;
		if (month > 12) month = 12;
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		if (day < 1) day = 1;
		if (day > 31) day = 31;
		if (this.month == 2 && day > 28) day = 28;
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
}
