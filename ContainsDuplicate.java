import java.util.*; 

class ContainsDuplicate{
	public static boolean containsDuplicate(int[] nums){
		int n = nums.length;
		if(n<2){
			return false;
		}


		HashSet<Integer> set = new HashSet<Integer>();

		for(int i=0; i<n; i++){
			if(set.contains(nums[i])){
				return true;
			}else{
				set.add(nums[i]);
			}
		}

		return false;
	}

	public static void main(String args[]){
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDuplicate(nums));
	}
}