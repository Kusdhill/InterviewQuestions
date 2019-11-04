class MinimumInRotatedSortedArray{
	public static int findMin(int[] nums){
		
		int n = nums.length;
		if(n<1){
			return -1;
		}
		if(n<2){
			return nums[0];
		}

		int left = 0;
		int right = n-1;

		while(left<right){
			int mid = left+(right-left)/2;

			if(nums[mid]<nums[right]){
				right = mid;
			}else{
				left = mid+1;
			}
		}
		return nums[left];
	}

	public static void main(String args[]){
		int[] nums = {4,5,6,7,0,1,2};
		System.out.println(findMin(nums));
	}
}