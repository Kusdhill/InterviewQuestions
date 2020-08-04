import java.util.HashMap;

// fib(0) = 0
// fib(1) = 1
// fib(2) = 1
// fib(3) = 2

class Fibonacci{
	HashMap<Integer, Integer> cache = new HashMap<>();

	public int fibonnaci(int n){
		if(n<=1){
			return n;
		}

		if(cache.containsKey(n)){
			return cache.get(n);
		}else{

		}

		cache.put(n, fibonnaci(n-1)+fibonnaci(n-2));
		return(cache.get(n));

	}


	public int recursiveFibonnaci(int n){

		if(n<=1){
			return n;
		}

		return fibonnaci(n-1) + fibonnaci(n-2);
	}

	public static void main(String[] args){

		Fibonacci fib = new Fibonacci();
		System.out.println(fib.fibonnaci(9));
		System.out.println(fib.recursiveFibonnaci(4));
	}
}