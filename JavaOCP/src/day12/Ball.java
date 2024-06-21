package day12;

public class Ball {
	private String color;
	private Integer price;
	
	public Ball(String color, Integer price) {
		this.color = color;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 自行實作相等法則
		Ball b2 = (Ball)obj; // 轉型
		if(color.equals(b2.color) && price.equals(b2.price)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return 7 * 13 * color.hashCode() + price.hashCode();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", price=" + price + "]";
	}
	
}
