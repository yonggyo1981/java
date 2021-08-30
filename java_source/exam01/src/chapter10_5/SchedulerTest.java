package chapter10_5;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� ��� ��� ����");
		System.out.println("R - ������� ���");
		System.out.println("L - ª�� ��⿭ ã�� ���");
		System.out.println("P - �켱������ ���� ���");
		
		 /* 
		  *  1����Ʈ ���� 1�� 
		  *  int -> ����  -1  
		  */
		int ch = System.in.read();
		Scheduler scheduler = null;
		if (ch == 'R') {
			scheduler = new RoundRobin();
		} else if (ch == 'L') {
			scheduler = new LeastJob();
		} else if (ch == 'P') {
			scheduler = new PriorityAllocation();
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}
}
