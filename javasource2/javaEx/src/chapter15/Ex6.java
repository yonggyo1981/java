package chapter15;

import java.io.*;

public class Ex6 {
	public static void main(String[] args) {
		try (RandomAccessFile rf = new RandomAccessFile("data.txt", "rw")) {
			rf.writeInt(100);
			System.out.println("��ġ : " + rf.getFilePointer());
			
			rf.writeUTF("�ȳ��ϼ���!");
			System.out.println("��ġ : " + rf.getFilePointer());
			
			rf.writeBoolean(false);
			System.out.println("��ġ : " + rf.getFilePointer());
			
			rf.seek(0);
			
			System.out.println(rf.readInt());
			System.out.println("��ġ : " + rf.getFilePointer());
			
			System.out.println(rf.readUTF());
			System.out.println("��ġ : " + rf.getFilePointer());
			
			System.out.println(rf.readBoolean());
			System.out.println("��ġ : " + rf.getFilePointer());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}
}
