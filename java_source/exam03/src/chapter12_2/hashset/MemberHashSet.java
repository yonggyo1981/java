package chapter12_2.hashset;

import java.util.HashSet;
import java.util.Iterator;
import chapter12_2.Member;

public class MemberHashSet {
	private HashSet<Member> members;
	
	public MemberHashSet() {
		members = new HashSet<Member>();
	}
	
	/** ȸ�� �߰� */
	public void addMember(Member member) {
		members.add(member);
	}
	
	/** ȸ�� ���� */
	public boolean removeMember(int memberId) {
		/**
		 *  ���� X -> �ε��� ��ȣ�� ��� ���� X 
		 *   �ε��� ��ȣ ������ �ݺ� ��ȸ X -> for(int i = 0;  X
		 *   ���� for��, Iterator�� ���ؼ� �ݺ� ��ȸ
		 */
		/*
		for (Member member : members) {
			if (member.getMemberId() == memberId) {
				members.remove(member);
				return true;
			}
		}
		*/
		
		Iterator<Member> ir = members.iterator();
		/***
		 * hasNext() -> ���� ��Ұ� �ִ��� ���� üũ(true, false) 
		 * next() -> ������Ҹ� �������� �޼���
		 */
		while(ir.hasNext()) {
			Member member = ir.next();
			if (member.getMemberId() == memberId) {
				members.remove(member);
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
