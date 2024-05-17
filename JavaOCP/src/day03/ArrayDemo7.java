package day03;

public class ArrayDemo7 {
	public static void main(String[] args) {
		// 飲料特價買一送一
		String name = "Fin運動飲料";
		int price = 25;
		int amount = 4;
		// 請計算本次消費金額 = ?
		int paidAmount = amount/2 + amount%2;
		int subtotal = paidAmount * price;
		System.out.println(paidAmount);
		System.out.println(subtotal);
		
	}
}
