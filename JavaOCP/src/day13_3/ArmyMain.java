package day13_3;

import java.util.stream.Stream;

public class ArmyMain {
	public static void main(String[] args) {
		Airplane airplane = new Fighter();
		Car car1 = new Tank();
		Car car2 = new Truck();
		
		airplane.move();
		car1.move();
		car2.move();
		
		Weapon weapon1 = new Fighter();
		Weapon weapon2 = new Tank();
		
		Stream.of(weapon1, weapon2).forEach(w -> w.shoot());
		Stream.of(weapon1, weapon2).forEach(Weapon::shoot);
		
		Stream.of(airplane, car1, car2, weapon1, weapon2)
			  .filter(w -> w instanceof Weapon) // 過濾出可以轉 Weapon 的物件
			  .map(w -> (Weapon)w) // 轉換成 Weapon 物件
			  .forEach(Weapon::shoot);
		
	}
}
