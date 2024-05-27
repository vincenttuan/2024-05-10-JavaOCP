package day06;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class StreamDemo7 {
	public static void main(String[] args) {
		int[] scores1 = {100, 45, 80, -1, 90, 55};
		int[] scores2 = {63, 78, 95, -3, -5, 610};
		// 合理分數範圍 0 <= score <= 100
		// 請透過 Stream 的 concat() 方法將二組陣列合併, 並得出總分,平均,最大與最小
		
		IntStream combinedStream = IntStream.concat(Arrays.stream(scores1), Arrays.stream(scores2));
		//combinedStream.forEach(score -> System.out.printf("%d ", score));
		
		IntSummaryStatistics stat = combinedStream.peek(score -> System.out.printf("%d ", score))
												  .filter(score -> score >= 0 && score <= 100)
												  .summaryStatistics();
		System.out.println();
		System.out.printf("總分: %d%n", stat.getSum());
		System.out.printf("平均: %.1f%n", stat.getAverage());
		System.out.printf("最高: %d%n", stat.getMax());
		System.out.printf("最低: %d%n", stat.getMin());
		System.out.printf("個數: %d%n", stat.getCount());
		
		
	}
}
