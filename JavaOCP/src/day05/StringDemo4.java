package day05;

public class StringDemo4 {
	
	public static void main(String[] args) {
		// String 不可變字串
		String s1 = "she sell sea shell on the sea shore";
		System.out.println(s1);
		
		s1 = s1.replace("sell", "buy");
		System.out.println(s1);
		
		//---------------------------------------------------
		// StringBuilder 可變字串
		StringBuilder s2 = new StringBuilder("she sell sea shell on the sea shore");
		System.out.println(s2);
		s2 = s2.replace(4, 8, "Buy");
		System.out.println(s2);
		
	}
	
}
