package chapter11_1;

public class StudentTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(20001425, "이름1");
		Student s2 = new Student(20001425, "이름1");
		
		Student s3 = (Student)s2.clone();
		
		System.out.println("s1과 s2 주소 일치? : " + (s1 == s2));
		System.out.println("s1과 s2의 equals(논리적 일치) ? : " + (s1.equals(s2)));
	}
}
