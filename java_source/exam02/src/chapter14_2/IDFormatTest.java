package chapter14_2;

public class IDFormatTest {
	private String userID;
	private String password;
	
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		/** 
		 * 1. null ���� �Ǹ� �ȵǴ� ����(O) 
		 * 2. �ڸ��� 8~20(O)
		 */

		if (userID == null) {
			throw new IDFormatException("���̵� null �Դϴ�.");
		}
		
		if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8~20�ڸ��� �Է��ϼ���.");
		}
		
		this.userID = userID;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException {
		/*
		 * 1) ��й�ȣ�� null(O)
			2) ���ڿ��θ� �̷��� ��� 
			3) 5�� ������ ���
		 */
		if (password == null) {
			throw new PasswordException("��й�ȣ�� null�̸� �ȵǿ�");
		}
		
		if (password.matches("[a-zA-Z]+") && password.matches("[!@#$%^&*]+") && password.matches("[0-9]+")) {
			throw new PasswordException("���ڿ� �̿ܿ� Ư������ �Ǵ� ���ڵ� �Բ� �Է�");
		}
		
		if (password.length() <= 5) {
			throw new PasswordException("��й�ȣ�� 6�ڸ� �̻�");
		}
		
		this.password = password;
	}
	
	public static void main(String[] args) {
		IDFormatTest ex = new IDFormatTest();
		// ���̵� null X, �ڸ����� 8~20
		String userID = null;
		try {
			ex.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		userID = "abcd";
		try {
			ex.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e);
		}
		
		String password = null;
		try {
			 password = null;
			ex.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e);
		}
		
		try {
			password = "abcd123!";
			ex.setPassword(password);
		} catch (PasswordException e) {
			System.out.println(e);
		}
	}
}
