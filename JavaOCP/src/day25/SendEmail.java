package day25;

public class SendEmail implements Runnable {

	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.println(tName + " 發送信件");
	}
	
}
