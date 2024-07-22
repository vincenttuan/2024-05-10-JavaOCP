package day21;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo3 {
	public static void main(String[] args) {
		// Map 的排序
		Map<String, Integer> unsortedMap = new LinkedHashMap<>();
		unsortedMap.put("David", 20);
		unsortedMap.put("Alice", 25);
		unsortedMap.put("Charlie", 35);
		unsortedMap.put("Bob", 30);
		System.out.println(unsortedMap);
		// TreeMap: 透過紅黑樹(O(Log))來進行排序
		Map<String, Integer> sortedMap = new TreeMap<>(unsortedMap);
		System.out.println(sortedMap);
		// 逐一印出元素(entry)
		for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
			
		
		
		
	}
}
