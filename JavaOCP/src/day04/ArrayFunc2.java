package day04;

//陣列與自訂函式(改良 ArrayFunc1.java)
public class ArrayFunc2 {
	public static void main(String[] args) {
		int[] scoreA = {100, 65, 73, 85, 92};
		int[] scoreB = {56, 65, 55, 66, 60};
		
		// 計算 A 與 B 的總分與平均 = ?
		calcSumAndAvg(scoreA, "A");
		calcSumAndAvg(scoreB, "B");
	}
	
	// 計算總和與平均的方法
	// 帶入"分數陣列"與"班級名稱"
	public static void calcSumAndAvg(int[] scores, String className) {
		int sum = 0;
		double avg = 0.0;
		int lens = scores.length;
		for(int i=0;i<lens;i++) {
			sum += scores[i];
		}
		avg = (double)sum / lens;
		System.out.printf("%s 班總分 %d 平均 %.1f%n", className, sum, avg);
	}
}
