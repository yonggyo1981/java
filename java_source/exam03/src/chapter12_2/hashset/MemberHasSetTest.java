package chapter12_2.hashset;

import chapter12_2.Member;

public class MemberHasSetTest {
	public static void main(String[] args) {
		MemberHashSet list = new MemberHashSet();
		list.addMember(new Member(1000, "�̸�1"));
		list.addMember(new Member(1001, "�̸�2"));
		list.addMember(new Member(1002, "�̸�3"));
		list.addMember(new Member(1000, "�̸�1"));
		
		list.showMembers();
	}
}
