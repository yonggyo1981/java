package chapter15_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex3 {
	public static void main(String[] args) {
		
		
		InputStreamReader isr = new InputStreamReader(System.in);
		try {
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			
			
			while(true) {
				int i = isr.read();
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
