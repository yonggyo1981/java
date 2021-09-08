package chapter14_2;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		/** 
		 * 1. null 값이 되면 안되는 조건(O) 
		 * 2. 자리수 8~20(O)
		 */

		if (userID == null) {
			throw new IDFormatException("아이디가 null 입니다.");
		}
		
		if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8~20자리로 입력하세요.");
		}
		
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest ex = new IDFormatTest();
		// 아이디 null X, 자리수는 8~20
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
