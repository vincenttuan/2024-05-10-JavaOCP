package day11;

public class Coffee {
	private String type;
	private char size;
	
	// 建構子超載
	public Coffee() {
		type = "美式";
		size = '大';
	}
	
	public Coffee(String type, char size) {
		this.type = type;
		this.size = size;
	}
	
	// 方法超載
	public void makeCoffee() {
		System.out.printf("我要 1 杯 %c%s%n", size, type);
	}
	
	public void makeCoffee(int amount) {
		System.out.printf("我要 %d 杯 %c%s%n", amount, size, type);
	}
	
	// 方法封裝
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}
	
	
}
