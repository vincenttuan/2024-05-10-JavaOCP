package day18;

import java.util.HashSet;
import java.util.Set;

public class SetDemo3 {

	public static void main(String[] args) {
		// Set 如何讓自訂元素不重複
		// 在自訂元素中必須自行實作 equals() & hashcode()
		Exam e1 = new Exam("Java", 100);
		Exam e2 = new Exam("Java", 100);
		Exam e3 = new Exam("VB", 90);
		Set set1 = new HashSet();
		set1.add(e1);
		set1.add(e2);
		set1.add(e3);
		System.out.println(set1);
		System.out.println(set1.size());
		
		
	}

}
