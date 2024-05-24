package day05;

public class StringDemo6 {

	public static void main(String[] args) {
		// 身分證驗證
		String id = "A123456789";
		          // 0123456789 <- index 位置
		System.out.println(id);
		char area = id.charAt(0); // A
		char gender = id.charAt(1); // 1
		System.out.println(area);
		System.out.println(gender);
		
		int num = (1*1 + 0*9) 
				+ (id.charAt(1)-48) * 8
				+ (id.charAt(2)-48) * 7
				+ (id.charAt(3)-48) * 6
				+ (id.charAt(4)-48) * 5
				+ (id.charAt(5)-48) * 4
				+ (id.charAt(6)-48) * 3
				+ (id.charAt(7)-48) * 2
				+ (id.charAt(8)-48) * 1
				+ (id.charAt(9)-48) * 1;
		
		System.out.println(num);
		System.out.println(num % 10 == 0);
	}

}
