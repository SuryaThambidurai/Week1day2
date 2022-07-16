package Week1.day2;

import java.util.Arrays;

public class DupValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {23, 56, 33, 23, 56, 77, 88, 99, 55, 45, 55, 77, 88};
		Arrays.sort(nums);
		
		int length = nums.length;
		for(int i=0;i< length-1;i++ ) {
			if(nums[i]==nums[i+1]) {
				System.out.println(nums[i]);
			}
		}

	}

}
