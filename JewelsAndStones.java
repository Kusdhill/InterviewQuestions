import java.util.*;

class JewelsAndStones{
	
	public static int jewelsAndStones(String J, String S){
		if(J.length()==0 || S.length()==0){
			return 0;
		}

		HashSet<Character> map = new HashSet<Character>();
		int count = 0;

		for(int i=0; i<J.length(); i++){
			map.add(J.charAt(i));
		}

		for(int i=0; i<S.length(); i++){
			if(map.contains(S.charAt(i))){
				count+=1;
			}
		}

		return count;
	}

	public static void main(String args[]){
		String J = "aA";
		String S = "aAAbbbb";
		System.out.println(jewelsAndStones(J,S));
	}
}