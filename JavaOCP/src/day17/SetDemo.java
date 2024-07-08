package day17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		// Set
		// HashSet 無序集合
		//Set set = new HashSet();
		// LinkedHashSet 有序集合
		Set set = new LinkedHashSet();
		set.add("國"); // String
		set.add(100); // Integer
		set.add("英");
		set.add(null);
		set.add(Integer.valueOf(90));
		set.add(new String("數"));
		set.add(70);
		
		System.out.println(set);
		
		

	}

}
