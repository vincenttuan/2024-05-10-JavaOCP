package day10;

import java.util.stream.IntStream;

public class VarargDemo2 {

	public static void main(String[] args) {
		int[] x = {1, 2, 3};
		int[] y = {4, 5, 6};
		
		IntStream.of(x).forEach(System.out::println);
		IntStream.of(y).forEach(System.out::println);
		IntStream.of(4, 5, 6).forEach(System.out::println);
		//--------------------------------------------------
		// 合併串流
		IntStream.concat(IntStream.of(x), IntStream.of(y)).forEach(System.out::println);
	}

}
