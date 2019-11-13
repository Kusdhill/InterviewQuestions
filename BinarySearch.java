import java.util.*;

class BinarySearch{
	public static int binarySearch(int[] nums, int target){
		
		if(nums==null || nums.length==0){
			return -1;
		}

		int n = nums.length;

		int left=0, right=n-1;
		int mid;
		
		while(left<right){
			mid = left + (right-left)/2;

			if(nums[mid]==target){
				return mid;
			}

			if(target<mid){
				right = mid-1;
			}else{
				left = mid+1;
			}
		}

		return -1;

	}

	public static int recursiveBinarySearch(int[] nums, int target){
		if(nums==null || nums.length==0){
			return -1;
		}

		int mid = nums.length/2;
		System.out.println(mid);

		if(nums[mid]==target){
			return mid;
		}else{
			if(target<=nums[mid]){
				System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, mid)));
				recursiveBinarySearch(Arrays.copyOfRange(nums, 0, mid), target);
			}else{
				System.out.println(Arrays.toString(Arrays.copyOfRange(nums, mid+1, nums.length)));
				recursiveBinarySearch(Arrays.copyOfRange(nums, mid+1, nums.length), target);
			}
		}

		return -1;
	}

	public static void main(String args[]){
		int[] nums = {0,1,2,3,4,5,6,7};
		int target = 6;
		//System.out.println(binarySearch(nums, target));
		System.out.println(recursiveBinarySearch(nums, target));
	}
}