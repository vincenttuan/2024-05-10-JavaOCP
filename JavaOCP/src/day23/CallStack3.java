package day23;

public class CallStack3 {
	public static void main(String[] args) {
		father(100);
	}
	
	public static void father(int cash) {
		try {
			mother(cash);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
	}
	
	public static void mother(int cash) throws Exception {
		son(cash);
	}
	
	public static void son(int cash) throws Exception {
		int breakfirst = 150; // 早餐一客
		
		if(cash - breakfirst < 0) {
			// 自行創建一個例外物件
			Exception e = new Exception("金額不足");
			throw e;
		}
		
		System.out.println("早餐買好了");
		
	}
	
}
