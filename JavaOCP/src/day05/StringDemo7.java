package day05;

import java.util.Random;
import static day05.StringDemo6.verifyId;

public class StringDemo7 {

	public static void main(String[] args) {
		Random r = new Random();
		// 身份證字號產生器
		String id = null;
		do {
			// 生成一個隨機身分證
			id = String.format("A%d%d%d%d%d%d%d%d%d", 
					r.nextInt(2) + 1,
					r.nextInt(10),
					r.nextInt(10),
					r.nextInt(10),
					r.nextInt(10),
					r.nextInt(10),
					r.nextInt(10),
					r.nextInt(10),
					r.nextInt(10));
		} while (!verifyId(id)); // 判斷id是否符合規則, 若不符則繼續迴圈
		
		System.out.println(id);
	}

}
