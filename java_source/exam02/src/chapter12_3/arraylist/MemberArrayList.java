package chapter12_3.arraylist;

import java.util.ArrayList;
import chapter12_3.Member;

/**
 * arrayList - �߰�, ����, ��� 
 *
 */
public class MemberArrayList {
	private ArrayList<Member> memberList;
	
	public MemberArrayList() {
		memberList = new ArrayList<Member>();
	}
	
	/** ȸ�� �߰� */
	public void addMember(Member member) {
		if (member != null) {
			memberList.add(member);
		}
	}
	
	/** ȸ�� ���� */
	public boolean removeMember(int memberId) {
		// get -> ArrayList -> ��Ҹ� ��ȸ
		for(int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i);
			if (member.getMemberId() == memberId) {
				memberList.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	/** ȸ����� ��� */
	public void showMembers() {
		for(Member member : memberList) {
			System.out.println(member);
		}
	}
}
