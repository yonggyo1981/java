package chapter14_3;

import java.io.*;

public class Ex2 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("b.txt");
			// throw new FileNotFoundException("����....");
			/*
			 * // FileNotFoundException e = new FileNotFoundException(....)
			 * IOException e = new FileNotFoundException(.....)
			 * Exception e = new FileNotFoundException(....)
			 *  Throwable e = new FileNotFoundException( .... )
			 */
		} catch (Exception e) { // ���ܰ� ��� �߻����� �� ������ �ȵɶ� 
			e.printStackTrace();
		}
	}
}
