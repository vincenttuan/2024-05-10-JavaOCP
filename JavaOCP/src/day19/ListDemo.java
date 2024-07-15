package day19;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>(); // 可變集合
		list.add(90); // 新增元素
		list.add(80);
		list.add(0, 70); // 可以指定放入位置
		System.out.println(list);
		
		// 修改元素
		list.set(1, 99);
		System.out.println(list);
		
		// 刪除元素
		//list.remove(1); // 刪除指定位置元素
		list.remove(Integer.valueOf(99)); // 刪除指定元素物件 
		System.out.println(list);
	}

}
