package chapter15_1;

import java.io.IOException;

public class Ex2 {
	public static void main(String[] args) {
		try {
			System.out.print("���� 1���� �Է��ϼ��� : ");
			int i = System.in.read(); 
			/**
			 *  byte -> unsigned byte (0�� ������ ���)
			 *  -128~127
			 *  unsigned 0~255
			 *  ���� �� ���� ��� -1�� ��ȯ 
			 *  int(4byte) -> char(2byte) 
			 */
			
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
