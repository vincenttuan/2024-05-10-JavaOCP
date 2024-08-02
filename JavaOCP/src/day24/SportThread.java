package day24;

// 運動類
public class SportThread extends Thread {
	
	@Override
	public void run() {
		long start = System.currentTimeMillis();
		marathon();
		long end = System.currentTimeMillis();
		System.out.printf("%s 執行時間: %d%n", Thread.currentThread().getName(), (end - start));
	}
	
	// 跑馬拉松(1000m)
	private void marathon() {
		String tName = Thread.currentThread().getName();
		for(int i=1;i<=1000;i++) {
			System.out.printf("%s 跑 %d 公尺%n", tName, i);
			/*
			if(tName.equals("兔子") && i==500) {
				try {
					Thread.sleep(100); // 100ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
			*/
		}
	}
	
}
