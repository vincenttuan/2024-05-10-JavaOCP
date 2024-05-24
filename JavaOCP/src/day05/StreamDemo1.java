package day05;

import java.util.Arrays;

public class StreamDemo1 {

	public static void main(String[] args) {
		// Stream 資料串流
		int[] scores = {100, 50, 70, 45, 90};
		// 1.利用 for-loop 將元素資料逐筆印出
		for(int i=0;i<scores.length;i++) {
			System.out.printf("%d ", scores[i]);
		}
		System.out.println(); // 換行
		// 2.利用 for-each(for/in) 將元素資料逐筆印出
		for(int score : scores) {
			System.out.printf("%d ", score);
		}
		System.out.println(); // 換行
		// 3.利用 Arrays.stream() 串流
		Arrays.stream(scores).forEach(score -> System.out.printf("%d ", score));
	}

}
