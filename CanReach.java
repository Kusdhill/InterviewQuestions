class CanReach {
    public static boolean canReach(int[] arr, int start) {
        if(start>=arr.length || start<0 || arr[start]<0) return false;
        if(arr[start]==0) return true;
        
        arr[start] = -arr[start];
        return canReach(arr, start+arr[start]) || canReach(arr, start-arr[start]);
    }
    
    public static void main(String[] args){
    	int[] arr = {4,2,3,0,3,1,2};
    	int start = 5;

    	System.out.println(canReach(arr, start));
    }
}