package day16.supplier;

import java.util.Random;
import java.util.function.Supplier;

/**
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
*/
public class SupplierDemo {

	public static void main(String[] args) {
		// 利用 Supplier 寫一個 Hello World
		Supplier<String> supplier1 = () -> "Hello World";
		// 利用 Supplier 得到一個幸運數字
		Supplier<Integer> supplier2 = () -> new Random().nextInt(100);
		
		printData(supplier1);
		printData(supplier2);
	}
	
	public static <T> void printData(Supplier<T> supplier) {
		T data = supplier.get();
		System.out.printf("得到: %s%n", data);
	}

}

