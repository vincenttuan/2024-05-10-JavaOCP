package day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("請輸入分數:");
			try {
				int score = sc.nextInt();
				System.out.printf("分數: %d 及格: %b%n", score, score >= 60);
				break; // 跳出迴圈
			} catch (InputMismatchException e) {
				System.err.println(e);
				System.err.println("請輸入數字");
				continue; // 繼續迴圈
			}
		}
	}
}
