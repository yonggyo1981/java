package chapter12_3.treeset;

import java.util.TreeSet;
import java.util.Iterator;
import chapter12_3.Member;

/**
 *  �߰�, ����, ��ȸ
 */
public class MemberTreeSet {
	private TreeSet<Member> memberList;
	
	public MemberTreeSet() {
		memberList = new TreeSet<Member>();
	}
	
	/** �߰� */
	public void addMember(Member member) {
		memberList.add(member);
	}
	
	/** ���� */
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = memberList.iterator();
		/**
		 * hasNext() 
		 * next()
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
	
	public void showMembers() {
		for (Member member : memberList) {
			System.out.println(member);
		}
	}
}
