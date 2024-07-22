package day21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入分數:");
		
		try {
			int score = sc.nextInt();
			System.out.printf("分數: %d 及格: %b%n", score, score >= 60);
		} catch (InputMismatchException e) {
			System.out.println(e);
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			System.out.println("請輸入數字");
		}
		
		

	}

}
