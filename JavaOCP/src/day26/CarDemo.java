package day26;

import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class CarDemo {

	public static void main(String[] args) {
		int party = 3;
		Runnable lunch = () -> System.out.println("吃午餐");
		CyclicBarrier cyclicBarrier = new CyclicBarrier(party, lunch);
		
		List<Car> cars = List.of(
				new Car(cyclicBarrier),
				new Car(cyclicBarrier),
				new Car(cyclicBarrier),
				new Car(cyclicBarrier),
				new Car(cyclicBarrier),
				new Car(cyclicBarrier));
		
		cars.forEach(Car::start);
		
	}

}
