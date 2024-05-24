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
	}

}
