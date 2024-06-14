package day10;

public class VarargDemo {
	
	public static int add(int[] nums) {
		int sum = 0;
		for(int n : nums) {
			sum += n;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {100, 90, 80};
		int[] nums2 = {100, 90, 80, 70, 60, 50};
		System.out.println(add(nums1));
		System.out.println(add(nums2));
		//-------------------------------------
		
	}

}
