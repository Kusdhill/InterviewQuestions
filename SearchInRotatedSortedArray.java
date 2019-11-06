class SearchInRotatedSortedArray{
	public static int search(int[] nums, int target){

		if(nums==null || nums.length==0){
			return -1;
		}

		int n = nums.length;
		int left = 0;
		int right = n-1;
		int mid;

		while(left<right){
			mid = left + (right-left)/2;
			if(nums[mid]>nums[right]){
				left = mid+1;
			}else{
				right = mid;
			}
		}

		int pivot = left;
		left = 0;
		right = n-1;

		if(target>=nums[pivot] && target<=nums[right]){
			left = pivot;
		}else{
			right = pivot;
		}

		while(left<=right){
			mid = left + (right-left)/2;
			if(nums[mid]==target){
				return mid;
			}else if(target<nums[mid]){
				right = mid-1;
			}else{
				left = mid+1;
			}
		}
		return -1;
	}

	public static void main(String args[]){
		
		int[] nums = {5,1,2,3,4};
		int target = 1;

		System.out.println(search(nums, target));
	}
}