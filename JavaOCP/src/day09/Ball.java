package day09;

public class Ball {
	private int price = 200;
	
	public Ball() {
		// price = 200;
		this.price = 100;
	}

	@Override
	public String toString() {
		return "Ball [price=" + price + "]";
	}
	
	// 主程式
	public static void main(String[] args) {
		Ball ball = new Ball();
		System.out.println(ball);
	}
	
}
