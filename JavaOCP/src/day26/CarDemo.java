package day26;

import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class CarDemo {

	public static void main(String[] args) {
		Runnable lunch = () -> System.out.println("吃午餐");
		Runnable dinner = () -> System.out.println("吃晚餐");
		CyclicBarrier cyclicBarrier1 = new CyclicBarrier(3, lunch);
		CyclicBarrier cyclicBarrier2 = new CyclicBarrier(6, dinner);
		
		List<Car> cars = List.of(
				new Car(cyclicBarrier1, cyclicBarrier2),
				new Car(cyclicBarrier1, cyclicBarrier2),
				new Car(cyclicBarrier1, cyclicBarrier2),
				new Car(cyclicBarrier1, cyclicBarrier2),
				new Car(cyclicBarrier1, cyclicBarrier2),
				new Car(cyclicBarrier1, cyclicBarrier2));
		
		cars.forEach(Car::start);
		
	}

}
