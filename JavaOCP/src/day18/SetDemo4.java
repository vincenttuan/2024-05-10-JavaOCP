package day18;

import java.util.HashSet;
import java.util.Set;

public class SetDemo4 {

	public static void main(String[] args) {
		// Set 泛型<>應用
		// set 集合中限定元素型別
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(100); // Integer
		set1.add(Integer.valueOf(200)); // Integer
		//set1.add("300"); // String 不可以放入
		set1.add(null);
		System.out.println(set1);
		
		// set 集合中支援部分元素型別
		// 例如:支援 Integer, Double
		//Set<Number> set2 = new HashSet<Number>();
		Set<Number> set2 = new HashSet<>(); // <> Java 7 自動推斷
		set2.add(100);
		set2.add(3.14);
		System.out.println(set2);
		
		// set 支援自訂型別
		Set<Exam> set3 = new HashSet<>();
		set3.add(new Exam("Java", 100));
		set3.add(new Exam("VB", 90));
		System.out.println(set3);
		
		
	}

}
