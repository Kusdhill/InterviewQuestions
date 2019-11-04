import java.util.*;

class TwoSum{
	
	public static int[] twoSum(int[] nums, int target){
		
		int n = nums.length;
		int result[] = new int[2];

		if(n<2){
			result[0] = 0;
			result[1] = 1;
			return result;
		}

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int compliment = 0;
		
		for(int i=0; i<n; i++){
			compliment = target-nums[i];
			if(map.containsKey(nums[i])){
				result[0] = map.get(nums[i]);
				result[1] = i;
				return result;
			}else{
				map.put(compliment,i);
			}
		}
		return result;
	}

	public static void main(String args[]){
		int[] nums = {2, 7, 11, 15};
		int target = 9;
	}
}