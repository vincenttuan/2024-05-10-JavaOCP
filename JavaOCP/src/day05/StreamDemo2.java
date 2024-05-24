package day05;

public class StreamDemo2 {
	public static void main(String[] args) {
		// Stream 資料串流
		int[] scores = {100, 50, 70, 45, 90};
		// 印出及格的分數
		// 1. for-loop
		for(int i=0;i<scores.length;i++) {
			if(scores[i] >= 60) { // 過濾條件 filter
				System.out.printf("%d ", scores[i]);
			}
		}
		System.out.println();
	}
}
