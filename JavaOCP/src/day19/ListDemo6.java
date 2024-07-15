package day19;

import java.util.ArrayList;
import java.util.List;

public class ListDemo6 {

	public static void main(String[] args) {
		Coffee c1 = new Coffee("美式", 50);
		Coffee c2 = new Coffee("拿鐵", 60);
		Coffee c3 = new Coffee("摩卡", 70);
		
		List<Coffee> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		System.out.println("list: " + list);
		
		// 不可變集合
		List<Coffee> immutableList = List.copyOf(list);
		System.out.println("immutableList: " + immutableList);
		
		// 新增咖啡, 不會影響 immutableList
		list.add(c3);
		System.out.println("list: " + list);
		System.out.println("immutableList: " + immutableList);
		
		// 變更 c1 的價格, 因為集合元素是透過 reference 參考到物件, 所以則會影響 immutableList
		c1.setPrice(40);
		System.out.println("list: " + list);
		System.out.println("immutableList: " + immutableList);

	}

}
