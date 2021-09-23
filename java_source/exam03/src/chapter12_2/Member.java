package chapter12_2;

public class Member implements Comparable<Member> {
	private int memberId;
	private String memberName;
	
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "���̵� : " + memberId + ", ȸ���� : " + memberName + ", hashcode=" + hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		if (member.getMemberId() == memberId) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public int compareTo(Member o) {
		//this  Member o  -> ��� -> ��������, ���� -> �������� 
		
		return (this.memberId - o.getMemberId()) * -1;
	}
}
