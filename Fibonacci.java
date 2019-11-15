class Fibonnacci{
	public static int fibonnaci(int n){

		if(n<=1){
			return n;
		}

		return fibonnaci(n-1) + fibonnaci(n-2);
	}

	public static void main(String[] args){
		System.out.println(fibonnaci(10));
	}
}