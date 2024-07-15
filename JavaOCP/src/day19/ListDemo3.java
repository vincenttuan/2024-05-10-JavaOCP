package day19;

import java.util.ArrayList;
import java.util.List;

public class ListDemo3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(2); // 移除元素2
		// 答案: [1, 2] 而不是 [1, 3]
		System.out.println(list);
	}

}
