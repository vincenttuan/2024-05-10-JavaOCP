package day24.after;

// 定義商品(Product), 銷售策略(Promotion), 購買數量(amount)
// 列印帳單(printBill)
public class Sales {
	private Product product; // 商品
	private Promotion promotion; // 銷售策略
	private int amount; // 購買數量
	
	public Sales(Product product, Promotion promotion, int amount) {
		this.product = product;
		this.promotion = promotion;
		this.amount = amount;
	}
	
	// 計算應付金額
	public int getTotal() {
		int bottles = promotion.getBottles(amount); // 計算應付的數量
		int total = bottles * product.getPrice();
		return total;
	}
	
	// 列印帳單
	public void printBill() {
		System.out.printf("%s促銷: 買 %d 送 %d%n", product.getName(), promotion.getX(), promotion.getY());
		System.out.printf("%s每瓶價格: %d 元%n", product.getName(), product.getPrice());
		System.out.printf("%s總購買數量: %d 瓶%n", product.getName(), amount);
		System.out.printf("應付款金額: %d 元%n", getTotal());
	}
	
	
}
