package day13;

// Latte 實現 Coffee 的介面規格
public class Latte implements Coffee {
	private String name; // 咖啡名稱
	private String origin; // 產地
	private double price; // 價格
	private int strength; // 濃度
	private String description; // 描述 
	
	public Latte(String name, String origin, double price, int strength, String description) {
		this.name = name;
		this.origin = origin;
		this.price = price;
		this.strength = strength;
		this.description = description;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

}
