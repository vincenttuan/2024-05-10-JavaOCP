package day02;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 建立房間時就給予初始值
		//int[] rooms = {4, 2, 3, 6, 1};
		int[] rooms = new int[]{4, 2, 3, 6, 1};
		System.out.println("房客入住後:");
		System.out.println(Arrays.toString(rooms));
		System.out.printf("房間數: %d 間%n", rooms.length);
		// 請計算房間總人數與平均人數
		//int sum = rooms[0] + rooms[1] + rooms[2] + rooms[3] + rooms[4];
		int sum = 0;
		for(int i=0;i<rooms.length;i++) {
			//sum = sum + rooms[i]; // 累加
			sum += rooms[i]; // 累加
		}
		double avg = (double)sum/rooms.length;
		
		System.out.printf("房間總人數:%d 平均人數:%.1f%n", sum, avg);
	}

}
