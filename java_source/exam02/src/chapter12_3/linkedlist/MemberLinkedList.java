package chapter12_3.linkedlist;

import java.util.LinkedList;
import chapter12_3.Member;

/**
 *  �߰�, ����, ��ȸ
 */
public class MemberLinkedList {
	private LinkedList<Member> memberList;
	
	public MemberLinkedList() {
		memberList = new LinkedList<Member>();
	}
	
	/** ȸ�� �߰� */
	public void addMember(Member member) {
		if (member != null) {
			memberList.add(member);
		}
	}
	
	/** ȸ�� ���� */
	public boolean removeMember(int memberId) {
		for (int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i);
			if (member.getMemberId() == memberId) {
				return true;
			}
		}
		
		return false;
	}
	
	/** ȸ�� ��� */
	public void showMembers() {
		for (Member member : memberList) {
			System.out.println(member);
		}
	}
}
