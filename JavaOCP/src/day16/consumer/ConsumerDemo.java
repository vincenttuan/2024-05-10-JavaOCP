package day16.consumer;

import java.util.Arrays;
import java.util.function.Consumer;

/**
@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
} 
*/
public class ConsumerDemo {

	public static void main(String[] args) {
		// Consumer
		Consumer<String> printInfo1 = (x) -> System.out.println(x);
		Consumer<String> printInfo2 = (x) -> System.out.println(x+x);
		Consumer<String> printInfo3 = (x) -> System.out.println(x.length());
		Consumer<String> printInfo4 = (x) -> System.out.println(new StringBuilder(x).reverse());
		
		String data = "Java";
		printData(data, printInfo1);
		printData(data, printInfo2);
		printData(data, printInfo3);
		printData(data, printInfo4);
		
		System.out.println("------------");
		Arrays.stream(new String[] {"Java", "Oracle", "OOPJP"})
			  .forEach(printInfo1);
		
		System.out.println("------------");
		Arrays.stream(new String[] {"Java", "Oracle", "OOPJP"})
		  	  .forEach(printInfo2);
		
		System.out.println("------------");
		Arrays.stream(new String[] {"Java", "Oracle", "OOPJP"})
			  .forEach(printInfo3);
		
		System.out.println("------------");
		Arrays.stream(new String[] {"Java", "Oracle", "OOPJP"})
		  	  .forEach(printInfo4);
	
	}
	
	// 印出 data 根據 consumer 的邏輯
	public static <T> void printData(T data, Consumer<T> consumer) {
		consumer.accept(data);
	}

}
