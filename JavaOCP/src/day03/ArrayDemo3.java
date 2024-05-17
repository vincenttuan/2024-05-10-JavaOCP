package day03;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// Java 一維陣列
		// 房間
		int[] rooms = {5, 4, 7, 0, 3};
		System.out.printf("房間數: %d%n", rooms.length);
		// 利用 for-loop 來輪詢陣列資料
		// i從0~<5
		for(int i=0;i<rooms.length;i++) {
			System.out.printf("%d 號房有 %d 人%n", i, rooms[i]);
		}
		System.out.println("---------------");
		// i從4~0
		for(int i=rooms.length-1;i>=0;i--) {
			System.out.printf("%d 號房有 %d 人%n", i, rooms[i]);
		}
		System.out.println("---------------");
		for(int i=0, lens=rooms.length;i<lens;i++) {
			System.out.printf("%d 號房有 %d 人%n", i, rooms[i]);
		}
		
	}

}
