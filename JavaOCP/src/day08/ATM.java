package day08;

public class ATM {
	public static void main(String[] args) {
		Account johnAct = new Account(); // John 帳戶
		johnAct.setName("John");
		Account maryAct = new Account(); // Mary 帳戶
		maryAct.setName("Mary");
		
		johnAct.deposit(5000);
		johnAct.printBalance();
		
		johnAct.withdraw(2000);
		johnAct.printBalance();
		
		johnAct.transfer(2500, maryAct);
		johnAct.printBalance();
		maryAct.printBalance();
		
	}
}
