package day06;

public class StreamDemo3 {

	public static void main(String[] args) {
		int[] scores = {100, 45, 80, -1, 90, 55};
		// 請印出所有合理的分數( score >= 0), 並計算總分,平均,最高分與最低分 
		// for-each: 印出所有合理的分數( score >= 0)
		for(int score : scores) {
			if(score >= 0) {
				System.out.printf("%d ", score);
			}
		}
		System.out.println();
		for(int score : scores) {
			if(score < 0) {
				continue;
			}
			System.out.printf("%d ", score);
		}
		System.out.println();
		//---------------------------------------------------------
		// for-each: 計算總分,平均
		int sum = 0; // 總分
		int lens = 0; // 資料筆數
		double avg = 0.0; // 平均
		for(int score : scores) {
			if(score < 0) {
				continue;
			}
			++lens; // 資料筆數+1
			sum += score; // 總分累加
		}
		avg = (double)sum / lens;
		System.out.printf("筆數: %d%n", lens);
		System.out.printf("總分: %d%n", sum);
		System.out.printf("平均: %.1f%n", avg);
		
		//---------------------------------------------------------
		// for-loop: 最高分
		int max = scores[0]; // 假設 scores[0] 是最高分
		for(int i=1;i<scores.length;i++) {
			if(scores[i] < 0) {
				continue;
			}
			if(scores[i] > max) {
				max = scores[i]; // 替換最高分
			}
		}
		System.out.printf("最高分: %d%n", max);
		//---------------------------------------------------------
		// for-loop: 最低分
		int min = scores[0]; // 假設 scores[0] 是最低分
		for(int i=1;i<scores.length;i++) {
			if(scores[i] < 0) {
				continue;
			}
			if(scores[i] < min) {
				min = scores[i]; // 替換最低分
			}
		}
		System.out.printf("最低分: %d%n", min);
	}

}










