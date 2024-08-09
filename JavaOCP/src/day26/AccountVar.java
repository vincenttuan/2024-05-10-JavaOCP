package day26;

public class AccountVar implements Account {
	private int balance; // 帳戶餘額
	
	public AccountVar(int balance) {
		this.balance = balance;
	}
	
	// 提款
	public synchronized void withdraw(int amount) {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 要提款 $%d%n", tName, amount);
	
		// 取得提款金額
		int currentBalance = balance;
		if(currentBalance >= amount) {
			// 開始提款
			for(int i=0;i<=999999999;i++); // 模擬提款延遲時間
			// 餘額扣除
			balance -= amount;
			System.out.printf("%s 提款 $%d 成功%n", tName, amount);
		} else {
			System.out.printf("%s 提款 $%d 失敗%n", tName, amount);
		}
		System.out.printf("帳戶餘額 $%d%n", balance);
	}
	
	
}
