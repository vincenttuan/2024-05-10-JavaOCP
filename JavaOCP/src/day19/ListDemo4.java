package day19;

import java.util.List;

public class ListDemo4 {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 3, 4, 5); // 不可變集合((ImmutableCollections)
		System.out.println(list);
		//list.add(6); // 不可新增
		//list.set(1, 7);  // 不可修改
		//list.remove(1);  // 不可刪除
		
	}
}
