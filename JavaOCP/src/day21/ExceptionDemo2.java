package day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			while (true) {
				System.out.print("請輸入2組分數:");
				try {
					int score1 = sc.nextInt();
					int score2 = sc.nextInt();
					System.out.printf("分數: %d 及格: %b%n", score1, score1 >= 60);
					System.out.printf("分數: %d 及格: %b%n", score2, score2 >= 60);
					break; // 跳出迴圈
				} catch (InputMismatchException e) {
					System.err.println(e);
					System.err.println("請輸入數字");
					sc.nextLine(); // 清空緩衝區
					continue; // 繼續迴圈
				}
			}
		} finally { // 一定保證會執行
			if(sc != null) {
				sc.close(); // 關閉
			}
		}
		
	}
}
