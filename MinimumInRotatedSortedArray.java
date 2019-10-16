class MinimumInRotatedSortedArray{
	public static int findMin(int[] nums){
		if(nums.length<2){
			return nums[0];
		}
		
		int left = 0;
		int right = nums.length-1;
		int min = Integer.MAX_VALUE;
		
		while(left<right){
			if(nums[right]<nums[left]){
				min = Math.min(nums[right], min);
				left+=1;
			}else{
				min = Math.min(nums[left], min);
				right-=1;
			}
		}
		
		return min;
	}

	public static void main(String args[]){
		int[] nums = {3,4,5,1,2};
		System.out.println(findMin(nums));
	}
}