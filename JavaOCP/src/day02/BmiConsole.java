package day02;

// 靜態 import static
import static day02.BmiUtil.getBmi;
import static day02.BmiUtil.getResult;
import static day02.BmiUtil.printBmiInfo;

public class BmiConsole {

	public static void main(String[] args) {
		// 使用 BmiUtil
		double h = 170.0;
		double w = 60.0;
		double bmi = getBmi(h, w);
		String result = getResult(bmi);
		System.out.println(bmi);
		System.out.println(result);
		//-------------------------------------
		printBmiInfo(h, w);
	}

}
