package chapter12_1;

public class Ex1 {
	public static void main(String[] args) {
		ThreeDPrinter printer = new ThreeDPrinter();
		printer.addMaterial(new Plastic());
		System.out.println(printer);
		
		printer.addMaterial(new Powder());
		System.out.println(printer);
	}
}
