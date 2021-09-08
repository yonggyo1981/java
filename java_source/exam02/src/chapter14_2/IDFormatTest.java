package chapter14_2;

public class IDFormatTest {
	private String userID;
	
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
	}
}
