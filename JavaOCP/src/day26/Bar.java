package day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Bar extends Thread {
	private String[] images = {"♠", "♥", "♦", "♣", "🃏", "7", "♤", "♡", "♢", "♧"};
	public static List<String> list = new ArrayList<>();
	
	private CyclicBarrier cyclicBarrier;
	
	public Bar(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}
	
	public void run() {
		System.out.println("啟動");
		try {
			Thread.sleep(3000);
			int i = new Random().nextInt(images.length);
			list.add(images[i]);
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println("Game Over !");
	}
}
