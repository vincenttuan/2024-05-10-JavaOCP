package day06;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class StreamDemo5 {
	public static void main(String[] args) {
		int[] scores = {100, 45, 80, -1, 90, 55};
		// 請印出所有合理的分數( score >= 0), 並計算總分,平均,最高分與最低分
		// 使用 Stream + 統計物件
		IntSummaryStatistics stat = Arrays.stream(scores)
										  .filter(score -> score >= 0)
										  .summaryStatistics();
		System.out.printf("總分: %d%n", stat.getSum());
		System.out.printf("平均: %.1f%n", stat.getAverage());
		System.out.printf("最高: %d%n", stat.getMax());
		System.out.printf("最低: %d%n", stat.getMin());
		System.out.printf("個數: %d%n", stat.getCount());
		
	}
}
