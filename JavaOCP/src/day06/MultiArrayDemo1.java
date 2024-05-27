package day06;

import java.util.Arrays;

public class MultiArrayDemo1 {

	public static void main(String[] args) {
		int[][] m = {
						{100,   90,   80},
                    // [0][0] [0][1] [0][2] 位置 						
						{70,    60,   50}
					// [1][0] [1][1] [1][2]	位置
					};
		
		System.out.println(m[0]); // 一維陣列
		System.out.println(Arrays.toString(m[0])); // 印出一維陣列的內容
		System.out.println(m[0][0]); // 值 = 100
		System.out.println(m[1][1]); // 值 = 60
		

	}

}
