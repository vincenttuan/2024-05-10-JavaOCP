package day18;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetDemo7 {

	public static void main(String[] args) {
		// Set 排序集合: 使用 TreeSet
		SortedSet<Integer> tree = new TreeSet<>();
		tree.add(5);
		tree.add(4);
		tree.add(7);
		tree.add(2);
		tree.add(6);
		tree.add(9);
		tree.add(1);
		System.out.println(tree);
		
		SortedSet<Integer> sub = tree.subSet(4, 8);
		System.out.println(sub);
		
		SortedSet<Integer> tail = tree.tailSet(5);
		System.out.println(tail);
		
		SortedSet<Integer> head = tree.headSet(5);
		System.out.println(head);
		
		System.out.println(tree.first());
		System.out.println(tree.last());
		
		tree.removeIf(n -> n % 2 == 0); // 將偶數元素移除
		System.out.println(tree);
	}

}
