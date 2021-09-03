package chapter12_1;

public class ThreeDPrinter {
	private Plastic material;
	
	public void setMaterial(Plastic material) {
		this.material = material;
	}
	
	public Plastic getMaterial() {
		return material;
	}
	
	@Override
	public String toString() {
		return material.toString();
	}
}
