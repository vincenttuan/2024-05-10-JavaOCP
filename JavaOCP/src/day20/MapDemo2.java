package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("國", 100, "數", 90, "英", 80 ); // ImmutableCollection
		System.out.println(map);
		//map.put("社", 70); // 不可以新增
		// 利用 keySet() 可以取出所有的鍵值(keys)
		Set<String> keys = map.keySet();
		System.out.println(keys);
		// 利用 values() 可以取出所有的內容
		List<Integer> values = new ArrayList<>(map.values());
		System.out.println(values);
	}

}