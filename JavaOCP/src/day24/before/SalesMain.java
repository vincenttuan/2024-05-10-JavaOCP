package day24.before;

public class SalesMain {

	public static void main(String[] args) {
		Sales sales1 = new Sales(3, 1, "錫蘭紅茶", 10, 5);
		Sales sales2 = new Sales(5, 2, "玫瑰花茶", 15, 12);
		Sales sales3 = new Sales(3, 1, "凍頂烏龍", 25, 18);
		Sales sales4 = new Sales(5, 2, "玫瑰花茶", 15, 20);
		
		sales1.printBill();
		sales2.printBill();
		sales3.printBill();
		sales4.printBill();
		
	}

}
