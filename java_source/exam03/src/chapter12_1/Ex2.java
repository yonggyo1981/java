package chapter12_1;

public class Ex2 {
	public static void main(String[] args) {
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.addMaterial(new Plastic());
		
		Plastic plastic = plasticPrinter.getMaterial();
		plastic.doPrinting();
		
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.addMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		powder.doPrinting();
		
		// GenericPrinter<Powder> -> ���׷� �ڷ���, Powder -> ���Ե� �ڷ��� 
		
	}
}
