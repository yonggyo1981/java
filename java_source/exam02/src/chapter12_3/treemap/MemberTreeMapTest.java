package chapter12_3.treemap;

import chapter12_3.Member;

public class MemberTreeMapTest {
	public static void main(String[] args) {
		MemberTreeMap list = new MemberTreeMap();
		list.addMember(new Member(1001, "�̸�1"));
		list.addMember(new Member(1002, "�̸�2"));
		list.addMember(new Member(1003, "�̸�3"));
		list.addMember(new Member(1004, "�̸�4"));
		
		list.showMembers();
	}
}
