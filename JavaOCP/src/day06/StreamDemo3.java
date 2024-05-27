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
		// for-each: 計算總分,平均
		int sum = 0; // 總分
		int lens = 0; // 資料筆數
		double avg = 0.0; // 平均
		for(int score : scores) {
			if(score < 0) {
				continue;
			}
			++lens;
			sum += score; // 總分累加
		}
		avg = (double)sum / lens;
		System.out.printf("筆數: %d%n", lens);
		System.out.printf("總分: %d%n", sum);
		System.out.printf("平均: %.1f%n", avg);
		
	}

}
