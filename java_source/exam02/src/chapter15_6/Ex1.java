package chapter15_6;

import java.io.IOException;
import java.io.File;

public class Ex1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		/**
		 * 1. ���丮 
		 * 2. �ӽ����� 
		 * 3. ����� ���� ���� 
		 * 4. ���� ���� ���� ��� 
		 */
		File dir = new File("D:\\testFold");
		dir.mkdir();
		
		//File tmpFile = File.createTempFile("pre", ".tmp", dir);
		//tmpFile.deleteOnExit();
		//Thread.sleep(5000);
		
		File dir2 = new File("D:\\");
		File[] files = dir2.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}
		
	}
}
