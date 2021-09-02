package chapter11_1;

import java.lang.reflect.*;

public class StudentTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1 = new Student(20001425, "�̸�1");
		Student s2 = new Student(20001425, "�̸�1");
	
		Student s3 = (Student)s2.clone();
		
		System.out.println("s2 : " + s2);
		System.out.println("s2 �ּ� : " + System.identityHashCode(s2));
		System.out.println("s3 : " + s3);
		System.out.println("s3 �ּ� : " + System.identityHashCode(s3));
		/*
		System.out.println("s1�� s2 �ּ� ��ġ? : " + (s1 == s2));
		System.out.println("s1�� s2�� equals(���� ��ġ) ? : " + (s1.equals(s2)));
		
		//System.arraycopy(s2, 0, s3, 0, 0);
		 */
		
		Class cls = s2.getClass();
		Constructor[] cons = cls.getConstructors();
		Method[] methods = cls.getMethods();
		Field[] fields = cls.getFields();
		System.out.println(cls.getName());
		
		System.out.println("----- ������ --------");
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("----- �޼��� ------");
		for (Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println("----- ���� -----");
		for(Field f : fields) {
			System.out.println(f);
		}
	}
}
