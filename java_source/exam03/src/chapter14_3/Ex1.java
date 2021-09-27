package chapter14_3;

public class Ex1 {
	public static void main(String[] args) {
		String memId = "abcdefg";
		String password = "1234";
		/*
		try {
			login(memId, password);
		} catch (MemberIDException e) {
			System.out.println(e.getMessage());
		} catch (MemberPassException e) {
			System.out.println(e.getMessage());
		}
		*/
		try {
			login(memId, password);
		} catch (MemberIDException |  MemberPassException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static boolean login(String memId, String password) throws MemberIDException, MemberPassException {
		/**
		 * ���̵� 6�ڸ� �̻����� üũ - �ƴϸ� MemberIDException �߻� 
		 */
		if (memId.length() < 6) {
			throw new MemberIDException("���̵�� 6�ڸ� �̻� �Է��� �ּ���.");
		}
		
		/**
		 *  ��й�ȣ 6�ڸ� �̻����� üũ - �ƴϸ� MemberPassException �߻� 
		 */
		if (password.length() < 6) {
			throw new MemberPassException("��й�ȣ 6�ڸ� �̻� �Է��� �ּ���.");
		}
		
		return true;
	}
	
}
