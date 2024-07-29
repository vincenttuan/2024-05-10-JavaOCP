package day23;

public class CallStack3 {
	public static void main(String[] args) {
		father(100);
	}
	
	public static void father(int cash) {
		try {
			mother(cash);
		} catch (NotEnougthException e) {
			System.out.println(e.getMessage());
			e.怎麼辦();
		}	
	}
	
	public static void mother(int cash) throws NotEnougthException {
		son(cash);
	}
	
	public static void son(int cash) throws NotEnougthException {
		int breakfirst = 150; // 早餐一客
		
		if(cash - breakfirst < 0) {
			// 自行創建一個例外物件
			NotEnougthException e = new NotEnougthException("金額不足");
			throw e;
		}
		
		System.out.println("早餐買好了");
		
	}
	
}
