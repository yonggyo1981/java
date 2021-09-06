package chapter12_3.arraylist;

import chapter12_3.Member;

public class QueueTest {
	public static void main(String[] args) {
		Queue<Member> queue = new Queue<>();
		queue.enQueue(new Member(1001, "�̸�1"));
		queue.enQueue(new Member(1002, "�̸�2"));
		queue.enQueue(new Member(1003, "�̸�3"));
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
