package chapter12_1;

public class Powder  extends Material {
	public void doPrinting() {
		System.out.println("Powder�� ������");
	}
	
	public void showInfo() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Powder ���";
	}
}
