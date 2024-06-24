package day13_2;

// 透過 AbstractCoffee 來實現 Coffee
public class AbstractCoffee implements Coffee {

	private String name; // 咖啡名稱
	private String origin; // 產地
	private double price; // 價格
	private int strength; // 濃度
	private String description; // 描述 
	
	public AbstractCoffee(String name, String origin, double price, int strength, String description) {
		this.name = name;
		this.origin = origin;
		this.price = price;
		this.strength = strength;
		this.description = description;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getOrigin() {
		return origin;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public int getStrength() {
		return strength;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
