package day20;

import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("國", 100, "數", 90, "英", 80 ); // ImmutableCollection
		System.out.println(map);
		//map.put("社", 70); // 不可以新增

	}

}
