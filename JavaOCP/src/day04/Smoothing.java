package day04;

public class Smoothing {
	public static void main(String[] args) {
		double[] prices = {742, 754, 783, 766, 782, 795, 790, 772, 780, 786, 800, 802, 796, 802, 819, 825.00, 839.00, 841.00, 835.00, 835.00};
		double alpha = 0.4;
		double forecast = getSmoothing(prices, alpha);
		System.out.printf("預測第 %d 天的股價 $%.2f%n", prices.length+1, forecast);
		
	}
	
	// 平滑指數預測
	public static double getSmoothing(double[] data, double alpha) {
		double forecast = data[0]; // 初始預設值為第一個實際值
		for(int i=0;i<data.length;i++) {
			forecast = alpha * data[i] + (1 - alpha) * forecast;
		}
		return forecast;
	}
	
	
}
