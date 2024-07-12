package day18;

import java.util.HashSet;
import java.util.Set;

public class SetDemo5 {
	public static void main(String[] args) {
		// Set 泛型<>應用的好處
		// 泛型<>的限制是出現在編譯時期而非執行時期
		Set<Integer> set1 = new HashSet<>();
		set1.add(100);
		set1.add(55);
		set1.add(70);
		System.out.println(set1);
		// 走訪集合並計算總分時不需要強制轉型
		int sum = 0;
		for(Integer score : set1) {
			sum += score;
		}
		System.out.println(sum);
		
	}
}
