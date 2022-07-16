package Week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] nums = {23, 45,-9, 12, 89, 32, -3};
Arrays.sort(nums);
System.out.println("Min value is: "+nums[0]);
int length = nums.length;
System.out.println("Max value is: "+nums[length-1]);
	}

}
