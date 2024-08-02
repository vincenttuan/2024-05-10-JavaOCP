package day24.after;

// 銷售策略
public class Promotion {
	private int x; // 買 x
	private int y; // 送 y
	
	public Promotion(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	// 計算要支付費用的瓶數
	public int getBottles(int amount) {
		int bottles = amount / (x+y) * x + amount % (x+y);
		return bottles;
	}
}
