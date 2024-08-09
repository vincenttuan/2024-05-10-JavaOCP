package day26;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Car extends Thread {
	
	private CyclicBarrier cyclicBarrier1;
	private CyclicBarrier cyclicBarrier2;
	
	public Car(CyclicBarrier cyclicBarrier1, CyclicBarrier cyclicBarrier2) {
		this.cyclicBarrier1 = cyclicBarrier1;
		this.cyclicBarrier2 = cyclicBarrier2;
	}
	
	@Override
	public void run() {
		String tName = Thread.currentThread().getName();
		System.out.printf("%s 從台北出發%n", tName);
		
		try {
			Thread.sleep(new Random().nextInt(3000)); // 模擬開車時間
			System.out.printf("%s 到台中了%n", tName);
			cyclicBarrier1.await(); // 等待其他人
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		
		System.out.printf("%s 繼續往高雄出發...%n", tName);
		
		try {
			Thread.sleep(new Random().nextInt(3000)); // 模擬開車時間
			System.out.printf("%s 到高雄了%n", tName);
			cyclicBarrier2.await(); // 等待其他人
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
	
}
