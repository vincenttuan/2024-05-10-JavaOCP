package day25;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadBatchDemo {
	public static void main(String[] args) {
		// 多筆 email 要發送
		String[] emailAddresses = {
				"a1@gmail.com",
				"b2@gmail.com",
				"c3@gmail.com",
				"d4@gmail.com",
				"e5@gmail.com",
		};
		
		// 建立執行緒池, 並設定固定數量的執行緒
		ExecutorService executor = Executors.newFixedThreadPool(3);
		
		// 將任務交給執行緒"池"並執行
		for(String emailAddress : emailAddresses) {
			executor.submit(new SendEmail(emailAddress));
		}
		
	}
}
