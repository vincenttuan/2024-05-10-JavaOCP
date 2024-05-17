package day03;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int[] scores   = {85, 70, 100, 40, 60};
		String[] names = {"國", "英", "數", "自", "社"};
		
		// 請印出 國=85, 英=70, 數=100, 自=40, 社=60
		for(int i=0, lens=scores.length;i<lens;i++) {
			System.out.printf("%s=%d", names[i], scores[i]);
			if(i < scores.length - 1) {
				System.out.print(", ");
			}
		}
		
	}
}
