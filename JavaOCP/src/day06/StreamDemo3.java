package day06;

public class StreamDemo3 {

	public static void main(String[] args) {
		int[] scores = {100, 45, 80, -1, 90, 55};
		// 請印出所有合理的分數( score >= 0), 並計算總分,平均,最高分與最低分 
		// for-each
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
	}

}
