package day26;

import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
	
	private CyclicBarrier cyclicBarrier;
	
	public Car(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 從台北出發%n", tName);
		try {
			Thread.sleep(new Random().nextInt(3000)); // 模擬開車時間
			System.out.printf("%s 到台中了%n", tName);
			cyclicBarrier.await(); // 等待其他人
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.printf("%s 繼續往高雄出發...%n", tName);
		
	}
	
}
