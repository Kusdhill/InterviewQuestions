import java.util.*;

class ProductOfArrayExceptSelf{
	public static int[] productOfArrayExceptSelf(int[] nums){
		int n = nums.length;
		
		if(n<2){
			return new int[] {0};
		}

		int[] left = new int[n];
		int[] right = new int[n];
		int[] res = new int[n];

		left[0] = 1;
		right[n-1] = 1;

		for(int i=1; i<n; i++){
			left[i] = left[i-1]*nums[i-1];
		}

		for(int i=n-2; i>-1; i--){
			right[i] = right[i+1]*nums[i+1];
		}

		for(int i=0; i<n; i++){
			res[i] = left[i]*right[i];
		}

		return res;

	}

	public static void main(String args[]){
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productOfArrayExceptSelf(nums)));
	}
}