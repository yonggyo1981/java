package chapter12_2.linkedlist;

import chapter12_2.Member;

public class MemberLinkedListTest {
	public static void main(String[] args) {
		MemberLinkedList list = new MemberLinkedList();
		list.addMember(new Member(1000, "�̸�1"));
		list.addMember(new Member(1001, "�̸�2"));
		list.addMember(new Member(1002, "�̸�3"));
		
		list.showMembers();
		System.out.println("---------------------------------------");
		list.popMember();
		list.showMembers();
	}
}
