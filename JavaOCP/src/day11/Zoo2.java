package day11;

// 多型的應用
public class Zoo2 {

	public static void main(String[] args) {
//		Dog dog = new Dog();
//		Cat cat = new Cat();
//		Tiger tiger = new Tiger();
		
//		Animal dog = new Dog();
//		Animal cat = new Cat();
//		Animal tiger = new Tiger();
		
		// var 自動推斷 
		var dog = new Dog(); // 相當於 Dog dog = new Dog();
		var cat = new Cat(); // 相當於 Cat cat = new Cat();
		var tiger = new Tiger(); // 相當於 Tiger tiger = new Tiger();
		
		Animal[] animals = {dog, cat, tiger};
		
		for(var animal : animals) {
			animal.sound();
		}
		
		Cat[] cats = {cat, tiger};
		for(var ca : cats) {
			ca.sound();
		}
		
		
	}

}
