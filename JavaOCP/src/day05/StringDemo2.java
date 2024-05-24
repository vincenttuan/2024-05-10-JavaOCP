package day05;

public class StringDemo2 {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = "Java";
		System.out.println(s1 == s2);
		
		s1 = s1.intern();
		System.out.println(s1 == s2);
		
	}
}
