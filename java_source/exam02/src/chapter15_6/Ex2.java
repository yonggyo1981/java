package chapter15_6;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ex2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("data2.dat", "rw");
		file.writeInt(100);
		System.out.println("������ ��ġ : " + file.getFilePointer());
		file.writeShort(20);
		System.out.println("������ ��ġ : " + file.getFilePointer());
		file.writeBoolean(false);
		System.out.println("������ ��ġ : " + file.getFilePointer());
		file.writeUTF("�ȳ��ϼ���.");
		System.out.println("������ ��ġ : " + file.getFilePointer());
		
		file.seek(0);
		System.out.println("������ ��ġ : " + file.getFilePointer());
		int num1 = file.readInt();
		System.out.println("������ ��ġ : " + file.getFilePointer());
		
		short num2 = file.readShort();
		System.out.println("������ ��ġ : " + file.getFilePointer());
		
		boolean bool = file.readBoolean();
		System.out.println("������ ��ġ : " + file.getFilePointer());
		
		String text = file.readUTF();
		System.out.println("������ ��ġ : " + file.getFilePointer());
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(bool);
		System.out.println(text);
	}
}
