package chapter15_1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Ex5 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int i;
		System.out.println("���ڸ� �Է��Ͻÿ�...");
		while((i = br.read()) != -1) {
			System.out.print((char)i);
		}
	}
}
