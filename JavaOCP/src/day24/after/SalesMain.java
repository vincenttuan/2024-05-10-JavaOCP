package day24.after;

public class SalesMain {

	public static void main(String[] args) {
		// 商品
		Product blackTea = new Product("紅茶", 10);
		Product greenTea = new Product("綠茶", 12);
		Product oolongTea = new Product("烏龍茶", 15);
		
		// 銷售策略(內含演算法)
		Promotion b2s1 = new Promotion(2, 1);
		Promotion b5s3 = new Promotion(5, 3);
		Promotion b1s1 = new Promotion(1, 1);
		
		// 銷售(針對商品, 銷售策略) + 買入數量
		// 烏龍茶買5送3買入10瓶
		Sales sales1 = new Sales(oolongTea, b5s3, 10);
		sales1.printBill();
		
		Sales sales2 = new Sales(greenTea, b1s1, 6);
		sales2.printBill();
		

	}

}
