package day12;

public class Milk {
	private String name;
	private Integer price;
	
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
		return "Milk [名稱=" + name + ", 價格=" + price + "]";
	}
	
}
