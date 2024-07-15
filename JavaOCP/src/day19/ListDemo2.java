package day19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
	// ArrayList: 新增, 查詢較快 (記憶體用量較小) O(1)
	// LinkedList: 修改. 刪除較快  (記憶體用量較大)
	public static void main(String[] args) {
		//List<Integer> list = new LinkedList<>(); // 可變集合
		List<Integer> list = new ArrayList<>(); // 可變集合
		list.add(90); // 新增元素
		list.add(50);
		list.add(40);
		list.add(70);
		list.add(40);
		System.out.println(list);
		
		// check 表示是否有刪除到元素
		boolean check = list.removeIf(x -> x < 60);
		System.out.println(check);
		System.out.println(list);
		
	}

}
