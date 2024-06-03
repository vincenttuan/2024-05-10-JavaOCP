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
		double bmi = getBmi();
		String result = getResult(bmi);
		System.out.printf("姓名: %s 身高: %.1f 體重: %.1f BMI: %.2f 診斷: %s%n", 
				name, height, weight, bmi, result);
	}
	
	private double getBmi() {
		double bmi = weight / Math.pow(height/100, 2);
		return bmi;
	}
	
	private String getResult(double bmi) {
		String result = bmi > 23 ? "過重" : bmi <= 18 ? "過輕" : "正常";
		return result;
	}
	
}
