class SearchInRotatedSortedArray{
	public static int search(int[] nums, int target){

		// set left and right pointers
		// get midpoint in array
		// if left mid or right == target, return index
		// if target is in between left and mid, create new mid on left half of array
		// else create new mid on right half of array

		int n = nums.length;

		if(n<1){
			return -1;
		}

		if(n==1){
			if(nums[0]==target){
				return 0;
			}else{
				return -1;
			}
		}

		int left = 0;
		int right = n-1;
		int mid;

		while(left<right){
			mid = left + (right-left)/2;
			
			// what's a cleaner way of doing the next 10 lines?
			if(nums[mid]==target){
				return mid;
			}

			if(nums[left]==target){
				return left;
			}

			if(nums[right]==target){
				return right;
			}

			if(target>=nums[left] && target<=nums[mid]){
				right = mid;
			}else{
				left = mid+1;
			}
		}
		return -1;
	}

	public static void main(String args[]){
		
		int[] nums = {4,5,6,7,0,1,2};
		int target = 0;

		System.out.println(search(nums, target));
	}
}