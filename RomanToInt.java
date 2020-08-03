import java.util.HashMap;

class RomanToInt {
    public static int romanToInt(String s) {
        
        int len = s.length();
        
        if(s==null || len<1) throw new IllegalArgumentException("must give valid number");
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);
        
        if(len==1) return map.get(s);
        
        int cur = 0;
        int next = 1;
        int res = 0;
        while(cur<len){
            
            boolean two = false;           
            String oneStr = null;

            // avoiding index out of range for last substr
            if(cur==len){
                oneStr = s.substring(len-1);
            }else{
                oneStr = s.substring(cur, cur+1); 
            }

            if(cur<len-1){
                String twoStrs = s.substring(cur,next+1);         
                if(map.containsKey(twoStrs)){
                    res+=map.get(twoStrs);
                    cur+=2;
                    next+=2;
                    
                    two = true;
                }
            }
            
            if(two) continue;
            
            if(map.containsKey(oneStr)){
                res+=map.get(oneStr);
                cur+=1;
                next+=1;
            }
        }
        
        return res;
    }

    public static void main(String[] args){
        System.out.println(romanToInt("CDVI"));
    }
}