package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSet {

	public static void main(String[] args) {
		List<String> emailList = new ArrayList<>();
		emailList.add("john@gmail.com");
		emailList.add("mary@gmail.com");
		emailList.add("john@gmail.com");
		emailList.add("john@gmail.com");
		
		// 使用 Stream 將 List 轉 Set
		Set<String> emails = emailList.stream().collect(Collectors.toSet());
		System.out.println(emails);

	}

}
