package day25;

public class WorkerThread extends Thread {

	@Override
	public void run() {
		System.out.println("瓦斯工人送瓦斯");
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println("發生意外: " + e);
			}
			System.out.printf("瓦斯工人送瓦斯中 %d 秒鐘%n", i);
		}
		System.out.println("瓦斯工人送瓦斯到家了");
	}

}
