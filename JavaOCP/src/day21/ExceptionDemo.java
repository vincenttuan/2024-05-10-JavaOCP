package day21;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分數:");
		int score = sc.nextInt();
		
		System.out.printf("分數: %d 及格: %b%n", score, score >= 60);
		
		

	}

}
