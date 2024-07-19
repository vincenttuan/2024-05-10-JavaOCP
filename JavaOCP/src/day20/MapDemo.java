package day20;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// Map -> 一群 Key/Value 的組合
		Map<String, Integer> map = new HashMap<>();
		map.put("國", 100);
		map.put("英", 90);
		map.put("數", 100);
		System.out.println(map);
		System.out.println(map.get("英"));
		System.out.println(map.get("社"));
		map.putIfAbsent("社", 70); // "社" 不存在時則建立元素
		System.out.println(map.get("社"));
		System.out.println(map);
		map.putIfAbsent("數", 30); // "數" 不存在時則建立元素, 因為 "數" 已經存在所以元素不會更新
		System.out.println(map);
		map.put("數", 4); // 不論 "數" 是否存在元素都會更新
		System.out.println(map);
	}

}
