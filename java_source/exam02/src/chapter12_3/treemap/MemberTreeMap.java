package chapter12_3.treemap;

import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import chapter12_3.Member;
import java.util.Comparator;

class IntegerDescOrder implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2) * -1; // ������ ���� ���� 
	}	
}

/** �߰�, ����, ��ȸ */
public class MemberTreeMap {
	private TreeMap<Integer, Member> memberList;
	
	public MemberTreeMap() {
		memberList = new TreeMap<Integer, Member>(new IntegerDescOrder());
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
		// Map -> Iterator X -> �ݺ� X
		// ��ȸ���� ���
		//Set<Integer> set = memberList.keySet();
		//Iterator ir = set.iterator();
		
		Iterator<Integer> ir = memberList.keySet().iterator();
		while(ir.hasNext()) {
			int memberId = ir.next();
			Member member = memberList.get(memberId);
			System.out.println(member);
		}
	}
}
