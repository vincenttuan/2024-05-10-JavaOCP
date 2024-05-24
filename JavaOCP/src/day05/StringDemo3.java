package day05;

public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = "My Java SE";
				  // 0123456789
		System.out.println(s1);
		String name = s1.substring(3, 7); // 索引值從 3 開始到小於 7 的位置資料
		System.out.println(name);
		
	}
}
