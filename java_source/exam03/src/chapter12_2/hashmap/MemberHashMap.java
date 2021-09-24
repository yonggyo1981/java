package chapter12_2.hashmap;

import java.util.HashMap;
import chapter12_2.Member;
import java.util.Iterator;

public class MemberHashMap {
	private HashMap<Integer, Member> members;
	
	public MemberHashMap() {
		members = new HashMap<Integer, Member>();
	}
	
	/** �߰� */
	public void addMember(Member member) {
		members.put(member.getMemberId(), member);
	}
	
	/** ���� */
	public boolean removeMember(int memberId) {
		// containsKey -> Ű���� ���� �ϴ��� 
		if (members.containsKey(memberId)) {
			members.remove(memberId);
			return true;
		}
		
		return false;
	}
	
	/** ��ȸ */
	public void showMembers() {
		// Map -> ���� X, Key���� Set �ڷ��� -> Set���� Iterator ���
		/*
		Iterator<Integer> ir = members.keySet().iterator();
		/** 
		 * hasNext() -> ���� ��Ұ� �ִ��� üũ, true, false 
		 * next() -> ���� ���
		 */
		/*
		while(ir.hasNext()) {
			int key = ir.next();
			Member member = members.get(key);
			System.out.println(member);
		}
		*/
	}
}
