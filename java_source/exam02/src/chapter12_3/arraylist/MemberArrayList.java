package chapter12_3.arraylist;

import java.util.ArrayList;
import chapter12_3.Member;

/**
 * arrayList - 추가, 삭제, 출력 
 *
 */
public class MemberArrayList {
	private ArrayList<Member> memberList;
	
	public MemberArrayList() {
		memberList = new ArrayList<Member>();
	}
	
	/** 회원 추가 */
	public void addMember(Member member) {
		if (member != null) {
			memberList.add(member);
		}
	}
	
	/** 회원 삭제 */
	public boolean removeMember(int memberId) {
		// get -> ArrayList -> 요소를 조회
		for(int i = 0; i < memberList.size(); i++) {
			Member member = memberList.get(i);
			if (member.getMemberId() == memberId) {
				memberList.remove(i);
				return true;
			}
		}
		
		return false;
	}
	
	/** 회원목록 출력 */
	public void showMembers() {
		for(Member member : memberList) {
			System.out.println(member);
		}
	}
}
