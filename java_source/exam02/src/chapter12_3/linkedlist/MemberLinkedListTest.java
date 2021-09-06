package chapter12_3.linkedlist;

import chapter12_3.Member;

public class MemberLinkedListTest {
	public static void main(String[] args) {
		MemberLinkedList list = new MemberLinkedList();
		
		list.addMember(new Member(1001, "�̸�1"));
		list.addMember(new Member(1002, "�̸�2"));
		list.addMember(new Member(1003, "�̸�3"));
		
		list.showMembers();
		System.out.println();
		
		list.removeMember(1002);
		
		list.showMembers();
		System.out.println();
		
		list.insertFirst(new Member(1004, "�̸�4"));
		list.showMembers();
	}
}
