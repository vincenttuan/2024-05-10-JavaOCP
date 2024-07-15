package day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo5 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(); // 可變集合
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("可變集合 list: " + list);
		
		// 創建不可修改集合 UnmodifiableCollection
		List<Integer> unmodifiableList = Collections.unmodifiableList(list);
		System.out.println("不可修改集合 unmodifiableList: " + unmodifiableList);
		//unmodifiableList.add(4); // 不可以新增, 修改與刪除
		
		// 創建不可變集合 ImmutableCollection
		List<Integer> immutableList = List.copyOf(list);
		// immutableList.add(4); // 不可以新增, 修改與刪除
		System.out.println("不可變集合 immutableList: " + immutableList);
		
		//BUT 若直接修改 list 會影響 unmodifiableList
		//因為 list 是 unmodifiableList 的底層集合
		System.out.println("list.add(4)");
		list.add(4);
		System.out.println("可變集合 list: " + list);
		System.out.println("不可修改集合 unmodifiableList: " + unmodifiableList);
		System.out.println("不可變集合 immutableList: " + immutableList);
		
	}
}
