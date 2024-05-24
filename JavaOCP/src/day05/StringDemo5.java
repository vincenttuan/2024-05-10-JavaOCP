package day05;

public class StringDemo5 {
	public static void main(String[] args) {
		StringBuilder msg = new StringBuilder("Java");
		append(msg);
		System.out.println(msg);
		//--------------------------------------------
		String data = "Java";
		add(data);
		System.out.println(data);
	}
	
	public static void append(StringBuilder sb) {
		sb.append("11");
	}
	
	public static void add(String s) {
		s = s.concat("11"); // s + "11";
	}
	
}
