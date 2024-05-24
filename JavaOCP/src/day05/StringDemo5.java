package day05;

public class StringDemo5 {
	public static void main(String[] args) {
		StringBuilder msg = new StringBuilder("Java");
		append(msg);
		System.out.println(msg);
	}
	
	public static void append(StringBuilder sb) {
		sb.append("11");
	}
	
}
