package day19;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		// Vector 自動增長機制
		Vector<Integer> vector = new Vector<>(41, 5); // initialCapacity, capacityIncremen
		for(int i=1;i<=41;i++) {
			vector.add(i);
		}
		vector.add(42);
		
		System.out.println("已用空間: " + vector.size());
		System.out.println("空間總數: " + vector.capacity());
	}
}
