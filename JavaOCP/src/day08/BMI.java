package day08;

public class BMI {
	private String name;
	private double height;
	private double weight;
	
	void setName(String name) {
		this.name = name;
	}
	
	void setHeight(double height) {
		this.height = height;
	}
	
	void setWeight(double weight) {
		this.weight = weight;
	}
	
	void printBmi() {
		double bmi = weight / Math.pow(height/100, 2);
		String result = bmi > 23 ? "過重" : bmi <= 18 ? "過輕" : "正常";
		System.out.printf("姓名: %s 身高: %.1f 體重: %.1f BMI: %.2f 診斷: %s%n", 
				name, height, weight, bmi, result);
	}
}
