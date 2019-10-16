class MaximumProductSubarray{
	public static int maxProduct(int[] nums){
		int curMax = nums[0];
		int curMin = nums[0];
		int totMax = nums[0];
		
		int temp;
		
		for(int i=1; i<nums.length; i++){
			temp = curMax;
			curMax = Math.max(nums[i], Math.max(nums[i]*curMax, nums[i]*curMin));
			curMin = Math.min(nums[i], Math.min(nums[i]*curMin, nums[i]*temp));
			totMax = Math.max(curMax, totMax);
		}
		return totMax;
	}

	public static void main(String args[]){
		int[] nums = {2,3,-2,4};
		System.out.println(maxProduct(nums));
	}
}