package chapter12_3.arraylist;

import java.util.ArrayList;
import chapter12_3.Member;
import java.util.Iterator;

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
	
	/** Ư�� ��ġ���� ȸ�� �߰� */
	public void insertMember(int index, Member member) {
		if (member != null && index >= 0 && index <= memberList.size()) {
			memberList.add(index, member);
		}
	}
	
	/** ȸ�� ���� */
	public boolean removeMember(int memberId) {
		// get -> ArrayList -> ��Ҹ� ��ȸ
		Iterator<Member> ir = memberList.iterator();
		while(ir.hasNext()) { // ���� ��Ұ� ������ true
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				memberList.remove(member);
				return true;
			}
		}
		/*
		for(int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i);
			if (member.getMemberId() == memberId) {
				memberList.remove(i);
				return true;
			}
		}
		*/
		return false;
	}
	
	/** ȸ����� ��� */
	public void showMembers() {
		for (Member member : memberList) {
			System.out.println(member);
		}
	}
}
