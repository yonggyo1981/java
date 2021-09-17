package chapter12_1;

public class ThreeDPrinter {
	Object material;
	
	void addMaterial(Object material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
}
