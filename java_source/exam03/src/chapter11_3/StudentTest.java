package chapter11_3;

public class StudentTest {
	public static void main(String[] args) {
		Student st1 = new Student(1000, "이름1");
		Student st2 = new Student(1000, "이름1");
		
		//System.out.println(st1 == st2); // false 
		//System.out.println(st1.equals(st2)); // false --> Object.equals -> 인스턴스의 주소 
		
		String text1 = new String("ABC");
		String text2 = new String("ABC");
		System.out.println(text1 == text2);
		System.out.println(text1.equals(text2)); // 논리적 동일성 -> 재정의
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		
	}
}
