package chapter13_2;

public class LamdaEx2 {
	public static void main(String[] args) {
		PrintString p = s -> s;
		showPrint(p);
		
		PrintString p2 = getPrintString();
		System.out.println(p2.print("�׽�Ʈ2"));
	}
	
	public static void showPrint(PrintString p) {
		System.out.println(p.print("�׽�Ʈ1"));
	}
	
	public static PrintString getPrintString() {
		//PrintString p = s -> s;
		//return p;
		return s -> s;
	}
}
