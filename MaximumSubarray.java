import java.util.*;

class MaximumSubarray{
	public static int maximumSubarray(int[] nums){
		int n = nums.length;

		if(n<2){
			return nums[0];
		}

		int curMax = nums[0];
		int totMax = nums[0];

		for(int i=1; i<n; i++){
			curMax = Math.max(curMax+nums[i], nums[i]);
			totMax = Math.max(totMax, curMax);
		}

		return totMax;
	}

	public static void main(String args[]){
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maximumSubarray(nums));
	}
}