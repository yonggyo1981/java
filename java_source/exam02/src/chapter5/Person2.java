package chapter5;

public class Person2 {
	private String name;
	
	public Person2() {
		 // name -> �̸�����
		//this.name = "�̸�2"; 
		this("�̸�����");
		this.name = "�̸�2";
		/**
		 * �������(�ν��Ͻ� ����)�� ���� ���� 
		 *  -> �ν��Ͻ��� ���� ���� -> ��������� �ڷ����� �°� �� ������ ���� -> ���� ����
		 *  ��������� ���� ���� -> ���� (X)
		 */
	}
	
	public Person2(String name) {
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(name);
	}
	
	public Person2 returnThis() {
		return this;
	}
	
	public static void main(String[] args) {
		Person2 person2 = new Person2(); // �̸� -> �⺻������ - �̸�����
		Person2 person = new Person2("�̸�1");
		Person2 person3 = person.returnThis();
		person.showInfo();
		person3.showInfo();
	}
}
