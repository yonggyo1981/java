package chapter14_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("test.java");
		} catch (IOException e) {
			e.printStackTrace();
			return; // return���� �Լ� �����ص� finally�� ����ȴ�. - �Լ� ���� ���ѵ� finally�� ������ ���� 
 		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			// ����, ������ �߻��ϵ� ���ϵ� ������ ����Ǵ� ����
			System.out.println("������ ����");
		}
		
		System.out.println("���!");
	}
}
