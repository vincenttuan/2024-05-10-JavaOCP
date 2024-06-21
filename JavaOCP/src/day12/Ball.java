package day12;

public class Ball {
	private String name;
	private Integer price;
	
	public Ball(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ball [name=" + name + ", price=" + price + "]";
	}
	
	
	
}
