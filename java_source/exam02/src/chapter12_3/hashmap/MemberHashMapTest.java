package chapter12_3.hashmap;

import chapter12_3.Member;

public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap list = new MemberHashMap();
		list.addMember(new Member(1003, "�̸�3"));
		list.addMember(new Member(1001, "�̸�1"));
		list.addMember(new Member(1004, "�̸�4"));
		list.addMember(new Member(1002, "�̸�2"));
		
		list.showMembers();
		System.out.println();
		
		list.removeMember(1004);
		list.showMembers();
		
	}
}
