package chapter12_3.hashset;

import chapter12_3.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet list = new MemberHashSet();
		list.addMember(new Member(1002, "�̸�2"));
		list.addMember(new Member(1001, "�̸�1"));
		list.addMember(new Member(1003, "�̸�3"));
		list.addMember(new Member(1002, "�̸�2"));
		list.addMember(new Member(1002, "�̸�4"));
		
		list.showMembers();
	}
}
