package day26;

public class ATM {

	public static void main(String[] args) {
		// 建立帳戶
		//Account account = new AccountVar(10000);
		Account account = new AccountFile();
		// 建立提款工作
		Withdraw withdraw1 = new Withdraw(account, 7000);
		Withdraw withdraw2 = new Withdraw(account, 5000);
		Withdraw withdraw3 = new Withdraw(account, 1000);
		// 建立提款執行緒
		Thread t1 = new Thread(withdraw1, "John");
		Thread t2 = new Thread(withdraw2, "Mary");
		Thread t3 = new Thread(withdraw3, "Rose");
		// 開始工作
		t1.start();
		t2.start();
		t3.start();
	}

}
