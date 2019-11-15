class Fibonnacci{

	public static int fibonnaci(int n){
		if(n<=1){
			return n;
		}

		return memoize(n);
	}

	public static int memoize(int n){
		int[] cache = new int[n+1];
		cache[0] = 0;
		cache[1] = 1;

		for(int i=2; i<=n; i++){
			cache[i] = cache[i-1] + cache[i-2];
		}

		return cache[n];
	}

	public static int recursiveFibonnaci(int n){

		if(n<=1){
			return n;
		}

		return fibonnaci(n-1) + fibonnaci(n-2);
	}

	public static void main(String[] args){
		System.out.println(fibonnaci(4));
		System.out.println(recursiveFibonnaci(4));
	}
}