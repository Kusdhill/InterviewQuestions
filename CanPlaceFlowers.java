class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed==null) return false;
        if(n==0) return true;
        int len = flowerbed.length;
        
        if(len<2){
            if(flowerbed[0]==0) return true;
            return false;
        }
        
        if(len==2){
            if(flowerbed[0]==0 && flowerbed[1]==0 && n==1){
                return true;   
            }else{
                return false;
            }
        }
        
        for(int i=0; i<len-2; i++){
            
            int beg = i;
            int mid = beg+1;
            int end = beg+2;
            
            int begVal = flowerbed[beg];
            int midVal = flowerbed[mid];
            int endVal = flowerbed[end];
            //System.out.println(beg+" "+mid+" "+end);
            if(beg==0){
                if(begVal==0 && midVal==0){
                    flowerbed[beg]=1;
                    begVal = flowerbed[beg];
                    n-=1;
                }
            }
            
            if(end==len-1){
                if(midVal==0 && endVal==0){
                    flowerbed[end]=1;
                    endVal = flowerbed[end];
                    n-=1;
                } 
            }
            
            if(begVal==0 && midVal==0 && endVal==0){
                flowerbed[mid]=1;
                midVal = flowerbed[mid];
                n-=1;
            }
            
            //System.out.println(Arrays.toString(flowerbed));
            if(n<=0) return true;
        }
        
        return false;
        
    }

    public static void main(String[] args){
        int[] flowerbed = {0,1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}