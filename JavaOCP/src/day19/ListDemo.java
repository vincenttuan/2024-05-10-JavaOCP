package day19;

import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(90);
		list.add(80);
		list.add(0, 70); // 可以指定放入位置
		
		System.out.println(list);
		
	}

}
