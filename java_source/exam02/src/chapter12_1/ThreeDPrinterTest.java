package chapter12_1;

public class ThreeDPrinterTest {
	public static void main(String[] args) {
		Plastic plastic = new Plastic();
		ThreeDPrinter printer = new ThreeDPrinter();
		printer.setMaterial(plastic);
		
		System.out.println(printer);
	}
}
