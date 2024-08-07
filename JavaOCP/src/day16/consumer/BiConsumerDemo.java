package day16.consumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
	public static void main(String[] args) {
		BiConsumer<String, Integer> printInfo1 = (x, y) -> System.out.printf("%s 分數 %d%n", x, y);
		BiConsumer<String, String> printInfo2 = (x, y) -> System.out.printf("%s 愛 %s%n", x, y);
		BiConsumer<Integer, Integer> printInfo3 = (x, y) -> System.out.printf("總合: %d%n", (x+y));
		
		printData("小明", 90, printInfo1);
		printData("小米", "大米", printInfo2);
		printData(100, 90, printInfo3);
	}
	
	// 印出 data 根據 biConsumer 的邏輯
	public static <T, U> void printData(T data1, U data2, BiConsumer<T, U> biConsumer) {
		biConsumer.accept(data1, data2);
	}

}
