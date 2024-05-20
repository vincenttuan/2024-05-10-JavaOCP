package day04;

import org.apache.commons.math3.stat.regression.SimpleRegression;

// 簡單線性回歸
public class Regression {
	
	public static void main(String[] args) {
		// 時間
		double[] times = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		// 價格
		double[] prices = {742, 754, 783, 766, 782, 795, 790, 772, 780, 786, 800, 802, 796, 802, 819, 825.00, 839.00, 841.00, 835.00, 835.00};
		
		// 利用簡單線性回歸
		SimpleRegression regression = new SimpleRegression();
		
		// 添加數據
		for(int i=0;i<prices.length;i++) {
			regression.addData(times[i], prices[i]);
		}
		
		// 跑模型
		regression.regress();
		
		// 得到明日的預測價格
		double predictedPrice = regression.predict(prices.length + 1);
		
		System.out.printf("明日預測價格 %.2f%n", predictedPrice);
		
	}
	
}
