public class HammingDistance {
    public static class Pair{
        int firstInt;
        int secondInt;
        
        String firstBin;
        String secondBin;
        
        public Pair(int firstInt, int secondInt){
            this.firstInt = firstInt;
            this.secondInt = secondInt;
            
            this.firstBin = Integer.toBinaryString(firstInt);
            this.secondBin = Integer.toBinaryString(secondInt);
            
        }
        
        public int countDiff(){
            int count = 0;
            for(int i=0; i<firstBin.length(); i++){
                if(i>secondBin.length()-1){
                    if(firstBin.charAt(i)!='0') count+=1;
                }else if(firstBin.charAt(i)!=secondBin.charAt(i)){
                    count+=1;
                }
            }
            
            return count;
        }
    }
    
    public static int totalHammingDistance(int[] nums) {
        if(nums.length<2){
            throw new IllegalArgumentException("must give more than 2 numbers");
        }
        
        int diff = 0;
        int j = 1;
        for(int i=0; i<nums.length-1; i++){
            while(j<nums.length){
                Pair numPair = new Pair(nums[i], nums[j]);
                diff += numPair.countDiff();
                j+=1;
            }
        }
        return diff;
    }

    public static void main(String[] args){
        int[] nums = {4,14,2};
        System.out.println(totalHammingDistance(nums));
    }
}


