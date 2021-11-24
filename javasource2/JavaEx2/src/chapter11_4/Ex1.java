package chapter11_4;

import java.lang.reflect.*;

public class Ex1 {
	public static void main(String[] args) throws ClassNotFoundException {
		//Class c = Class.forName("chapter11_4.Person");
		//Class c = Person.class;
		Class c = new Person().getClass();
		
		System.out.println(c.getName());
		
		Constructor[] cons = c.getConstructors();
		System.out.println("---------- ������ --------------");
		for (Constructor con : cons) {
			System.out.println(con);
		}
		
		System.out.println("---------- �޼��� --------------");
		Method[] methods = c.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println("---------- ������� --------------");
		Field[] fields = c.getFields();
		for (Field f : fields) {
			System.out.println(f);
		}
	}
}
