package day04;

//陣列與自訂函式(改良 ArrayFunc2.java 成函式功能單一職責)
public class ArrayFunc3 {
	
	public static void main(String[] args) {
		int[] scoreA = {100, 65, 73, 85, 92};
		int[] scoreB = {56, 65, 55, 66, 60};
		
		// 印出 A 班平均
		double avgA = getAvg(scoreA);
		System.out.printf("A 班平均 %.1f%n", avgA);
		
		// 印出 B 班總分
		int sumB = getSum(scoreB);
		System.out.printf("B 班總分 %d%n", sumB);
		
	}
	
	// 計算總和並回傳
	public static int getSum(int[] scores) {
		int sum = 0;
		for(int i=0, lens=scores.length;i<lens;i++) {
			sum += scores[i];
		}
		return sum;
	}
	
	// 計算平均並回傳
	public static double getAvg(int[] scores) {
		int sum = getSum(scores);
		double avg = (double)sum/scores.length;
		return avg;
	}
	
	// 列印資料
	public static void printScore(int sum, double avg, String className) {
		System.out.printf("%s 班總分 %d 平均 %.1f%n", className, sum, avg);
	}
}
