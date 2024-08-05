package day25;

public class SendEmail implements Runnable {
	private String emailAddress;
	
	public SendEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " 執行發送信件程式到 " + emailAddress);
	}
	
}
