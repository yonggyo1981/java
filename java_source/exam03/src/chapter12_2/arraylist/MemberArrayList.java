package chapter12_2.arraylist;

import java.util.ArrayList;
import chapter12_2.Member;

public class MemberArrayList {
	
	private ArrayList<Member> members;
	
	public MemberArrayList() {
		members = new ArrayList<Member>();
	}
	
	/** ȸ�� �߰� */
	public void addMember(Member member) { // add
		members.add(member);
	}
	
	/** ȸ�� ���� */
	public boolean removeMember(int memberId) { 
		// .size() -> ����� ����, .get(index ��ȣ)
		for (int i = 0; i < members.size(); i++) {
			Member member = members.get(i);
			if (member.getMemberId() == memberId) {
				 // remove
				members.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	/** ȸ�� ��ȸ */
	public void showMembers() {
		for (Member member : members) {
			System.out.println(member);
		}
	}
}
