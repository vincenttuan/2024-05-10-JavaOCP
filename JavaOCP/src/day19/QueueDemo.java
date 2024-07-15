package day19;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("放油");
		queue.add("打蛋");
		queue.add("調味");
		queue.add("起鍋");
		
		System.out.println(queue);
		
		while (!queue.isEmpty()) {
			String work = queue.poll();
			System.out.println(queue + " => " + work);
		}
		
		System.out.println(queue);
		
	}
}
