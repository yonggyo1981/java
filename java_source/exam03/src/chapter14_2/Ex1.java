package chapter14_2;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ex1 {
	public static void main(String[] args) {
		FileInputStream fis  = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			fis = new FileInputStream("a.txt"); // ���ҽ� ��� -> ���� ����
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			System.out.println("�����? ���� �ɱ��?");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				
				if (isr != null)
					isr.close();
				
				if (fis != null)
					fis.close();
					
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("���� �ǳ���?");
	} 
}
