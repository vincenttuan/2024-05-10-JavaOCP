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
	public static void printData(String data1, Integer data2, BiConsumer<String, Integer> biConsumer) {
		biConsumer.accept(data1, data2);
	}
	
	public static void printData(String data1, String data2, BiConsumer<String, String> biConsumer) {
		biConsumer.accept(data1, data2);
	}
	
	public static void printData(Integer data1, Integer data2, BiConsumer<Integer, Integer> biConsumer) {
		biConsumer.accept(data1, data2);
	}
}
