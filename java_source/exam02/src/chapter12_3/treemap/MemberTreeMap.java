package chapter12_3.treemap;

import java.util.TreeMap;
import chapter12_3.Member;

/** �߰�, ����, ��ȸ */
public class MemberTreeMap {
	private TreeMap<Integer, Member> memberList;
	
	public MemberTreeMap() {
		memberList = new TreeMap<Integer, Member>();
	}
	
	/** �߰� */
	public void addMember(Member member) {
		memberList.put(member.getMemberId(), member);
	}
	
	/** ���� */
	public boolean removeMember(int memberId) {
		if (memberList.containsKey(memberId)) {
			memberList.remove(memberId);
			return true;
		} else {
			return false;
		}
	}
	
	/** ��� */
	public void showMembers() {
		
	}
}
