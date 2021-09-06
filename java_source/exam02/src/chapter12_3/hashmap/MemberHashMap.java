package chapter12_3.hashmap;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import chapter12_3.Member;

/* �߰�, ����, ��ȸ */
public class MemberHashMap {
	private HashMap<Integer, String> memberList;
	
	public MemberHashMap() {
		memberList = new HashMap<Integer, String>();
	}
	
	/** �߰� */
	public void addMember(Member member) {
		memberList.put(member.getMemberId(), member.getMemberName());
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
		Set<Integer> set = memberList.keySet();
		Iterator<Integer> ir = set.iterator();
		while(ir.hasNext()) {
			int memId = ir.next();  // ȸ�� ���̵�
			String memNm = memberList.get(memId);
			System.out.println("���̵� : " + memId + ", ȸ�� �̸� : " + memNm);
		}
	}
}
