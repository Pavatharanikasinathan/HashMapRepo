package HashMap;

public class Dress {
	private String material;
	private int price;
	private boolean isBranded;
	private String color;
	private int size;
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMaterial() {
		return material;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setIsBranded(boolean isBranded) {
		this.isBranded = isBranded;
	}
	public boolean getIsBranded() {
		return isBranded;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public Dress(String material,int price,boolean isBranded,String color,int size) {
		this.material = material;
		this.price = price;
		this.isBranded = isBranded;
		this.color = color;
		this.size = size;
	}
	public String toString() {
		return "Material="+material+", "+"Price="+price+", "+"Is Branded="+isBranded+", "+"Color="+color+", "+"Size="+size;
	}

}
