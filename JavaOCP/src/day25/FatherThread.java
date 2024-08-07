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
		
		try {
			worker.join(3000); // 設定 join() 時間
			//worker.join();
			if(worker.isAlive()) {
				// 工人雖已超時但仍在執行
				System.out.println("爸爸洗冷水澡1");
			} else {
				System.out.println("爸爸開始洗熱水澡");
			}
		} catch (InterruptedException e) {
			System.out.println("爸爸洗冷水澡2");
			//e.printStackTrace();
		} finally {
			System.out.println("爸爸洗完澡了");
		}
		
	}
	
	// 主程式
	public static void main(String[] args) {
		Thread father = new FatherThread();
		father.start();
	}
	
}
