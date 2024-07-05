package day16.predicate;

import java.util.function.Predicate;
/**
@FunctionalInterface
public interface Predicate<T> {
	boolean test(T t);
}
*/
public class PredicateDemo {

	public static void main(String[] args) {
		// 利用 Predicate 判斷分數是否及格 ?
		Predicate<Integer> pred1 = (x) -> x >= 60;
		
		// 利用 Predicate 判斷是否是偶數 ?
		Predicate<Integer> pred2 = (x) -> x % 2 == 0;
		
		// 利用 Predicate 判斷是否有資料 ?
		Predicate<String> pred3 = (x) -> !x.isEmpty();
		
		printData(80, pred1, "及格", "不及格");
		printData(75, pred2, "偶數", "奇數");
		printData("Java", pred3, "有資料", "無資料");
	}
	
	public static <T> void printData(T data, Predicate<T> pred, String trueValue, String falseValue) {
		boolean check = pred.test(data);
		System.out.printf("%s %s%n", data, check?trueValue:falseValue);
	}
	

}
