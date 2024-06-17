package day11;

// 結帳(Overloading 超"多"載)
public class Checkout {
	
	// 現金結帳
	public void submit(int cash) {
		System.out.printf("現金 $%d 結帳%n", cash);
	}
	
	// 信用卡結帳
	public void submit(int cash, String cardNo) {
		System.out.printf("卡號: %s 刷金額 $%d 結帳%n", cardNo, cash);
	}
	
	// 優惠碼
	public void submit(int cash, int code) {
		System.out.printf("優惠碼: %s 刷金額 $%d 結帳%n", code, cash);
	}
	
	// 免費
	public void submit() {
		System.out.println("結帳免費");
	}
	
}
