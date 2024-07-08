package day17;

public class Coffee {
	private String name; // 咖啡名稱
	private CoffeeSize size; // 容量
	private Double price; // 價格 (容量 * 0.8)
	
	public Coffee(String name, CoffeeSize size) {
		this.name = name;
		this.size = size;
		calculatePrice(); // 計算價格
	}
	
	// 計算價格的方法
	private double calculatePrice() {
		return size.getMl() * 0.8;
	}

	@Override
	public String toString() {
		return "Coffee [name=" + name + ", size=" + size + ", price=" + price + "]";
	}
	
	
}
