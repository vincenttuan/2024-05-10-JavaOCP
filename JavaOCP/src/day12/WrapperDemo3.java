package day12;

import java.util.Arrays;

public class WrapperDemo3 {

	public static void main(String[] args) {
		Integer[] scores1 = {
				Integer.valueOf(100),
				Integer.valueOf(90),
				Integer.valueOf(80)
		};
		
		Integer[] scores2 = {100, 90, 80}; // auto-boxing
		
		int sum1 = 0;
		for(Integer score : scores2) {
			sum1 += score.intValue();
		}
		System.out.println(sum1);
		
		int sum2 = 0;
		for(Integer score : scores2) { 
			sum2 += score; // auto-unboxing
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for(int score : scores2) { // auto-boxing 
			sum3 += score; // auto-unboxing
		}
		System.out.println(sum3);
		
		int sum4 = Arrays.stream(scores2)
						 //.mapToInt(score -> score.intValue())
						 //.mapToInt(score -> score) // auto-unboxing
						 .mapToInt(Integer::intValue)
						 .sum();
		System.out.println(sum4);

	}

}
