package day21;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo5 {
	public static void main(String[] args) {
		
		// 成員
		Person p1 = new Person("Bob", 25);
		Person p2 = new Person("Alice", 30);
		Person p3 = new Person("David", 20);
		Person p4 = new Person("Charlie", 35);
		// 成績 Map, 可以根據　Person 的 name 來排序
		// 使用 TreeMap 元素間並根據 value 來排序 ?
		Map<Person, Integer> scores = new TreeMap<>();
		scores.put(p1, 100);
		scores.put(p2, 80);
		scores.put(p3, 50);
		scores.put(p4, 75);
		System.out.println(scores);
		
		Map<Person, Integer> scores2 = new TreeMap<>(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return scores.get(o1).compareTo(scores.get(o2));
			}
		});
		scores2.putAll(scores);
		System.out.println(scores2);
		
		Map<Person, Integer> scores3 = new TreeMap<>((o1, o2) -> scores.get(o1).compareTo(scores.get(o2)));
		scores3.putAll(scores);
		System.out.println(scores3);
		
		
	}
}
