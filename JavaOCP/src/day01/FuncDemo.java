package day01;

public class FuncDemo {

	public static void main(String[] args) {
		double h1 = 170, w1 = 60;
		double bmi1 = getBmi(h1, w1);
		
		double h2 = 180, w2 = 95;
		double bmi2 = getBmi(h2, w2);
		
		double h3 = 150, w3 = 40;
		double bmi3 = getBmi(h3, w3);
		
		System.out.println(bmi1);
		System.out.println(bmi2);
		System.out.println(bmi3);
	}
	
	// 取得 bmi 的方法
	private static double getBmi(double h, double w) {
		double bmi = w / Math.pow(h/100, 2);
		return bmi;
	} 

}
