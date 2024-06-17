package day11;

// 多型的應用-轉型
public class Zoo3 {

	public static void main(String[] args) {
		Tiger tiger = new Tiger();
		tiger.sound();
		tiger.skill();
		
		Cat cat = new Tiger();
		cat.sound();
		//cat.skill(); // 錯誤
		((Tiger)cat).skill(); // 轉型
		
		Animal animal = new Tiger();
		animal.sound();
		((Tiger)animal).skill();
		
		((Cat)animal).sound();
		
		// 轉型前要加上 instanceof 判斷
		if(animal instanceof Dog) {
			((Dog)animal).sound();
		} else {
			System.out.printf("%s 不可轉 Dog%n", animal.getClass().getSimpleName());
		}
		
	}

}
