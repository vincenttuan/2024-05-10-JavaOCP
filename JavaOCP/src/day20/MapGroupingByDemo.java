package day20;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;
import static java.util.function.Function.identity;

// 關於資料分組 grouping by
public class MapGroupingByDemo {

	public static void main(String[] args) {
		List<String> fruits = List.of("香蕉", "山竺", "山竺", "山竺", "芒果", "榴槤", "芒果", "西瓜", "西瓜");
		System.out.println(fruits);
		Map<String, Long> result = fruits.stream()
										 //.collect(Collectors.groupingBy(name -> name, Collectors.counting()));
										 //.collect(groupingBy(name -> name, counting()));
										 .collect(groupingBy(identity(), counting()));
		
		System.out.println(result);

	}

}
