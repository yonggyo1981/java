package chapter15_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
	public static void main(String[] args) {
		int i;
		
		try {
			System.out.print("���ڸ� �Է��Ͻÿ�. : ");
			InputStreamReader isr = new InputStreamReader(System.in);
			while(( i = isr.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
