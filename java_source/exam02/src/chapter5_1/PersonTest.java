package chapter5_1;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person("ö��", 50);
		Rice rice = new Rice(250);
		
		person.eat(rice);
		person.eat(rice);
		person.eat(rice);
		person.eat(rice);
		person.eat(rice);
		
	}
}
