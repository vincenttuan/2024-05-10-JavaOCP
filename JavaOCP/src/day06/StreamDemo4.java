package day06;

import java.util.Arrays;

public class StreamDemo4 {

	public static void main(String[] args) {
		int[] scores = {100, 45, 80, -1, 90, 55};
		// 請印出所有合理的分數( score >= 0), 並計算總分,平均,最高分與最低分
		// 使用 Stream
		// 總分
		int sum = Arrays.stream(scores)
						.filter(score -> score >= 0)
						.sum();
		System.out.printf("總分: %d%n", sum);
		
		// 平均
		double avg = Arrays.stream(scores)
						   .filter(score -> score >= 0)
						   .average()
						   .getAsDouble();
		System.out.printf("平均: %.1f%n", avg);
		
		// 最大值
		int max = Arrays.stream(scores)
						.filter(score -> score >= 0)
						.max()
						.getAsInt();
		System.out.printf("最大值: %d%n", max);
		
		

	}

}
