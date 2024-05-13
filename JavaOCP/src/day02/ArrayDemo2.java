package day02;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// 建立房間時就給予初始值
		//int[] rooms = {4, 2, 3, 6, 1};
		int[] rooms = new int[]{4, 2, 3, 6, 1};
		System.out.println("房客入住後:");
		System.out.println(Arrays.toString(rooms));

	}

}
