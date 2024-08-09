package day26;

// 提款工作
public class Withdraw implements Runnable {
	
	private Account account; // 帳戶
	private int amount; // 提款金額
	
	public Withdraw(Account account, int amount) {
		this.account = account;
		this.account = account;
	}
	
	@Override
	public void run() {
		account.withdraw(amount); // 進行提款
	}
	
}
