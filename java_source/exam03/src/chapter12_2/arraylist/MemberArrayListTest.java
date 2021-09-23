package chapter12_2.arraylist;

import chapter12_2.Member;

public class MemberArrayListTest {
	public static void main(String[] args) {
		MemberArrayList list = new MemberArrayList();
		
		list.addMember(new Member(1000, "�̸�1"));
		list.addMember(new Member(1001, "�̸�2"));
		list.addMember(new Member(1002, "�̸�3"));
		
		list.showMembers();
		
		list.removeMember(1001);
		System.out.println("----------------------------------------");
		list.showMembers();
	}
}
