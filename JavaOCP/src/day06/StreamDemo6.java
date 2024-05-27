package day06;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class StreamDemo6 {
	public static void main(String[] args) {
		int[] scores1 = {100, 45, 80, -1, 90, 55};
		int[] scores2 = {63, 78, 95, -3, -5, 610};
		// 合理分數範圍 0 <= score <= 100
		// 請透過 System.arraycopy() 將二組陣列合併, 並得出總分,平均,最大與最小
		
		// 合併二個陣列
		int[] combinScores = new int[scores1.length + scores2.length];
		System.out.println(Arrays.toString(scores1));
		System.out.println(Arrays.toString(scores2));
		System.out.println(Arrays.toString(combinScores));
		
		// arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		//                  來源                     目的                   資料長度 
		System.arraycopy(scores1, 0, combinScores, 0, scores1.length);
		System.out.println(Arrays.toString(combinScores));
		//System.arraycopy(scores2, 0, combinScores, 6, scores2.length);
		System.arraycopy(scores2, 0, combinScores, scores1.length, scores2.length);
		System.out.println(Arrays.toString(combinScores));
		
		IntSummaryStatistics stat = Arrays.stream(combinScores)
										  .filter(score -> score >= 0 && score <= 100)
										  .summaryStatistics();
		
		System.out.printf("總分: %d%n", stat.getSum());
		System.out.printf("平均: %.1f%n", stat.getAverage());
		System.out.printf("最高: %d%n", stat.getMax());
		System.out.printf("最低: %d%n", stat.getMin());
		System.out.printf("個數: %d%n", stat.getCount());
		
	}
}
