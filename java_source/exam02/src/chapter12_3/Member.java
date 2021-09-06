package chapter12_3;

import java.util.Comparator;

public class Member /* implements /* Comparable<Member> */ /* Comparator<Member> */ {
	
	private int memberId; // ȸ�����̵�
	private String memberName; // ȸ���̸�
	
	public Member() {}
	
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
		return "���̵� : " + memberId + ", ȸ�� �̸� : " + memberName + ", �ؽ��ڵ� : " + hashCode();
	}

	@Override
	public int hashCode() {
		/** ���̵� �����ϸ� ���� �ι� */
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		Member member = (Member)obj;
		if (member.getMemberId() == memberId) {
			return true;
		} else {
			return false;
		}
		
	}

	/*
	 * @Override
	public int compare(Member o1, Member o2) {
		// TODO Auto-generated method stub
		return o1.getMemberId() - o2.getMemberId();
	}
	*/
	/*
	@Override
	public int compareTo(Member o) {
	
		//return memberId - o.getMemberId(); // ��������(ȸ�����̵�)
		//return (memberId - o.getMemberId()) * -1; // ��������(ȸ�����̵�)
		
		//return memberName.compareTo(o.getMemberName()); // ȸ�������� ��������
		return memberName.compareTo(o.getMemberName()) * -1; // ȸ�������� ��������
	}
	*/
}
