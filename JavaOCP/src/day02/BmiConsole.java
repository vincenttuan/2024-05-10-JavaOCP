package day02;

public class BmiConsole {

	public static void main(String[] args) {
		// 使用 BmiUtil
		double h = 170.0;
		double w = 60.0;
		double bmi = BmiUtil.getBmi(h, w);
		String result = BmiUtil.getResult(bmi);
		System.out.println(bmi);
		System.out.println(result);
		//-------------------------------------
		BmiUtil.printBmiInfo(h, w);
	}

}
