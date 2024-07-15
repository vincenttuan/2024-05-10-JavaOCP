package day19;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>(); // 可變集合
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
