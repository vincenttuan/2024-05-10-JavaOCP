package day02;

import java.util.Scanner;
// 靜態 import static
import static day02.BmiUtil.getBmi;
import static day02.BmiUtil.getResult;
import static day02.BmiUtil.printBmiInfo;

public class BmiConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("請輸入身高與體重(例如: 170 60):");
		// 使用 BmiUtil
		double h = scanner.nextDouble();
		double w = scanner.nextDouble();
		double bmi = getBmi(h, w);
		String result = getResult(bmi);
		System.out.println(bmi);
		System.out.println(result);
		//-------------------------------------
		printBmiInfo(h, w);
	}

}
