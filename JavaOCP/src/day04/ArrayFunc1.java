package day04;

// 陣列與自訂函式
public class ArrayFunc1 {

	public static void main(String[] args) {
		int[] scoreA = {100, 65, 73, 85, 92};
		int[] scoreB = {56, 65, 55, 66, 60};
		
		// 計算 A 與 B 的總分與平均 = ?
		int sumA = 0;
		double avgA = 0.0;
		for(int i=0, lens=scoreA.length;i<lens;i++) {
			sumA += scoreA[i];
		}
		avgA = (double)sumA / scoreA.length;
		System.out.printf("A 班總分 %d 平均 %.1f%n", sumA, avgA);
		//-------------------------------------------------------
		int sumB = 0;
		double avgB = 0.0;
		for(int i=0, lens=scoreB.length;i<lens;i++) {
			sumB += scoreB[i];
		}
		avgB = (double)sumB / scoreB.length;
		System.out.printf("B 班總分 %d 平均 %.1f%n", sumB, avgB);
		
		
	}

}
