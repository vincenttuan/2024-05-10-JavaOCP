package day26;

import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class PlayBar {

	public static void main(String[] args) {
		int party = 3;
		Runnable result = () -> System.out.println(Bar.list);
		CyclicBarrier cyclicBarrier = new CyclicBarrier(party, result);
		
		List.of(new Bar(cyclicBarrier), 
				new Bar(cyclicBarrier), 
				new Bar(cyclicBarrier))
			.forEach(Bar::start);

	}

}
