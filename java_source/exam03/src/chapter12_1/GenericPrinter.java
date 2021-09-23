package chapter12_1;

public class GenericPrinter<T extends Material> { // T(type), E(Element), K(Key), V(Value) .... 
	T material;
	
	public void addMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public void printing() { // �� ��Ằ �μ� ���
		material.doPrinting();
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
}
