package chapter12_1;

public class Plastic extends Material {
	public void doPrinting() {
		System.out.println("Plastic ���� ������");
	}
	
	public void showInfo() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Plastic ���";
	}
}
