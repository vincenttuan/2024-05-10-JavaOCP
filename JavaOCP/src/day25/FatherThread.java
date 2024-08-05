package day25;

// 父親執行緒
public class FatherThread extends Thread {

	@Override
	public void run() {
		System.out.println("爸爸下班回家");
		System.out.println("爸爸要去洗澡");
		System.out.println("爸爸發現沒瓦斯");
		System.out.println("爸爸請瓦斯工人送瓦斯");
		
		Thread worker = new WorkerThread();
		worker.start();
		
		System.out.println("爸爸開始洗澡");
		System.out.println("爸爸洗完澡了");
	}
	
}
