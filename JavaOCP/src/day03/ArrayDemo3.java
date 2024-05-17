package day03;

public class ArrayDemo3 {

	public static void main(String[] args) {
		// Java 一維陣列
		// 房間
		int[] rooms = {5, 4, 2, 0, 3};
		System.out.printf("房間數: %d%n", rooms.length);
		for(int i=0;i<rooms.length;i++) {
			System.out.printf("%d 號房有 %d 人%n", i, rooms[i]);
		}
	}

}
