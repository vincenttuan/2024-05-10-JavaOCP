package day08;

public class BMITest {

	public static void main(String[] args) {
		BMI johnBmi = new BMI();
		johnBmi.setName("約翰");
		johnBmi.setHeight(170.0);
		johnBmi.setWeight(60.0);
		johnBmi.printBmi();
		
		BMI marioBmi = new BMI();
		marioBmi.setName("瑪莉歐");
		marioBmi.setHeight(140.0);
		marioBmi.setWeight(70.5);
		marioBmi.printBmi();
		
	}

}
