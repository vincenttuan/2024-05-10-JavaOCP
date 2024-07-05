package day16.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunctionDemo {

	public static void main(String[] args) {
		// 請用 BiFunction 設計一個 BMI 運算邏輯
		BiFunction<Double, Double, Double> func1 = (h, w) -> w / Math.pow(h/100, 2);
		
		// 利用 BinaryOperator 改寫
		BinaryOperator<Double> func2 = (h, w) -> w / Math.pow(h/100, 2);
		
		double h = 170, w = 60;
		double bmi = func1.apply(h, w);
		double bmi2 = func2.apply(h, w);
		
		System.out.printf("h: %.1f w: %.1f bmi: %.2f%n", h, w, bmi);
		System.out.printf("h: %.1f w: %.1f bmi: %.2f%n", h, w, bmi2);
		
	}
	
}
