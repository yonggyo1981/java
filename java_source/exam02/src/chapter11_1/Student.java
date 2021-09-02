package chapter11_1;

/** �� �������̽� -> Cloneable -> �ǻ� ǥ�� -> ��Ŀ �������̽� */
public class Student implements Cloneable {
	public int studentID; // �й�
	public String name; // �̸� 
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		// ���ϴ� Student �ν����� �й��� ������ �������� ����
		Student s = (Student)obj;
		if (s.studentID == studentID) 
			return true;
		
		return false;
	}

	@Override
	public int hashCode() {
		return studentID;
	}

	@Override
	public String toString() {
		return "�й� : " + studentID + ", �̸� : " + name;
	}
	
	@Override 
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
