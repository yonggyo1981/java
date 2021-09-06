package chapter12_3.hashset;

import java.util.HashSet;
import java.util.Iterator;
import chapter12_3.Member;

/**
 * �߰�, ����, ��ȸ
 */
public class MemberHashSet {
	private HashSet<Member> memberList;
	
	public MemberHashSet() {
		memberList = new HashSet<Member>();
	}
	
	/** �߰� */
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	/** ���� */
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = memberList.iterator();
		/**
		 * hasNext() -> ���� ��Ұ� �ִ��� ���� üũ 
		 * next() -> ���� ��Ҹ� �������� �޼���
		 */
		while(ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				memberList.remove(member);
				return true;
			}
		}
		
		return false;
	}
	
	/** ��� */
	public void showMembers() {
		for (Member member : memberList) {
			System.out.println(member);
		}
	}
}
