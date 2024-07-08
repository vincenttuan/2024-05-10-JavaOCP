package day17;

public class Ball {
	private String color;
	private int price;
	
	public Ball(String color, int price) {
		this.color = color;
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		Ball b2 = (Ball)obj;
		return color.equals(b2.color) && price == b2.price; 
	}

	@Override
	public String toString() {
		return "Ball [color=" + color + ", price=" + price + "]";
	}
	
}
