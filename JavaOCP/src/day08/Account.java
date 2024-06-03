package day08;

// 銀行帳戶
public class Account {
	private String name; // 戶名
	private int balance; // 餘額
	
	// 設定戶名(name)
	void setName(String name) {
		if(name == null || name.trim().length() == 0) {
			System.out.println("戶名設定錯誤");
			return;
		}
		this.name = name.trim(); // trim() 除去字串的左右空白
	}
	
	// 存款(存款金額)
	void deposit(int amount) { 
		if(amount <= 0) {
			System.out.println("存款失敗: 存款金額不得 <= 0");
			return;
		}
		balance += amount; // 餘額累加
	}
	
	// 提款(提款的金額)
	void withdraw(int amount) {
		if(amount <= 0) {
			System.out.println("提款失敗: 提款金額不得 <= 0");
			return;
		}
		if(amount > balance) {
			System.out.println("提款失敗: 餘額不足");
			return;
		}
		balance -= amount; // 餘額扣抵 
	}
	
	// 轉帳(轉帳金額, 轉帳對象)
	void transfer(int amount, Account act) {
		if(amount <= 0) {
			System.out.println("轉帳失敗: 轉帳金額不得 <= 0");
			return;
		}
		if(amount > balance) {
			System.out.println("轉帳失敗: 餘額不足");
			return;
		}
		balance -= amount; // 我方: 餘額扣抵(提款)
		act.deposit(amount); // 對方: 存款
	}
	
	// 查詢(印出)帳戶餘額
	void printBalance() {
		System.out.printf("戶名: %s 餘額: %,d%n", name, balance);
	}
	
}
