package day09;

public class Coffee {
	private String name;
	private int price;
	private String origin;
	
	public Coffee(String name, int price, String origin) {
		this.name = name;
		this.price = price;
		this.origin = origin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", origin=" + origin + "]";
	}
	
	
}
