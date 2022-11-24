package HashMap;

public class Table {
	private String type;
	private boolean isSteel;
	private int price;
	private String color;
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setIsSteel(boolean isSteel) {
		this.isSteel = isSteel;
	}
	public boolean  getIsSteel() {
		return isSteel;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public Table(String type,boolean isSteel,int price,String color) {
	this.type = type;
	this.isSteel = isSteel;
	this.price = price;
	this.color = color;
	}
	public String toString() {
		return "Type="+type+", "+"Is Steel="+isSteel+", "+"Price="+price+", "+"Color="+color;
	}
}
