package day18;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// Set
		// HashSet 無序集合
		//Set set = new HashSet();
		// LinkedHashSet 有序集合
		Set set = new LinkedHashSet();
		set.add("國"); // String
		set.add(100); // Integer
		set.add("英");
		set.add(null);
		set.add(Integer.valueOf(90));
		set.add(new String("數"));
		set.add(70);
		
		System.out.println(set);
		System.out.println(set.size());
		
		// 資料輪詢-for
		for(Object obj : set) {
			System.out.println(obj);
		}
		System.out.println("------");
		// 資料輪詢-iterator (可以移除元素)
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
			// 當 obj == null 移除元素
			if(obj == null) {
				System.out.println("將" + obj + "移除");
				iter.remove();
			}
		}
		System.out.println("------");
		System.out.println(set);
		
		// 資料輪詢-forEach
		//set.forEach((Object obj) -> System.out.println(obj));
		//set.forEach((var obj) -> System.out.println(obj));
		//set.forEach((obj) -> System.out.println(obj));
		//set.forEach(System.out::println);
		set.stream().forEach(System.out::println); // 循序流(預設)
		//set.parallelStream().forEach(System.out::println); // 並行流(支援多核心處理)
	}

}
