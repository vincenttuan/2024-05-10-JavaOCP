package day04;

import static day04.ArrayFunc3.getAvg;

public class ArrayFunc4 {

	public static void main(String[] args) {
		int[] scoreA = {100, 65, 73, 85, 92};
		int[] scoreB = {56, 65, 55, 66, 60};
		// A, B 哪一班成績較集中 ?
		double sdA = getSD(scoreA);
		double sdB = getSD(scoreB);
		String className = sdA < sdB ? "A" : "B";
		System.out.printf("A班標準差: %.2f%nB班標準差: %.2f%n%s班分數較集中%n", sdA, sdB, className);
	}
	
	// 計算標準差
	public static double getSD(int[] scores) {
		double avg = getAvg(scores);
		double delta = 0;
		int lens = scores.length;
		for(int i=0;i<lens;i++) {
			delta += Math.pow(scores[i] - avg, 2);
		}
		double sd = Math.sqrt(delta/lens);
		return sd;
	} 

}
