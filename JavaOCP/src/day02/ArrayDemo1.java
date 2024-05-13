package day02;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] rooms = new int[5];
		// [I@1ee0005
		// [ => 一維陣列
		// I => int
		// @ => At(在)
		// 1ee0005 => 該物件的雜湊值
		System.out.println(rooms);
		
		System.out.println("房客入住前:");
		//System.out.println(rooms[0] + ", " + rooms[1] + ", " + rooms[2] + ", " + rooms[3] + ", " + rooms[4]);
		System.out.println(Arrays.toString(rooms));
		// 房客入住
		rooms[0] = 4;
		rooms[1] = 2;
		rooms[2] = 3;
		rooms[3] = 6;
		rooms[4] = 1;
		
		System.out.println("房客入住後:");
		System.out.println(Arrays.toString(rooms));
		
	}

}
