package chapter11_3;

public class Student implements Cloneable  { // �� �������̽� -> ����ڰ� clone�� ����� �� ���� 
	// Serializable -> ��Ŀ�������̽�(����)
	private int studentID;
	private String name;
	
	public Student(int studentID, String name) {
		this.studentID = studentID;
		this.name = name;
	}
	
	@Override 
	public String toString() {
		return "�й� : " + studentID + ", �̸� : " + name;
	}

	@Override
	public boolean equals(Object obj) { // Student st2
		Student student = (Student)obj;
		if (student.studentID == studentID) {
			return true;
		}
		
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public int hashCode() {
		
		return studentID;
	}
}
