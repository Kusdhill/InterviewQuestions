class BuyAndSellStock{
	public static int maxProfit(int[] prices){

		int n = prices.length;
		if(n<2){
			return 0;
		}

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = Integer.MIN_VALUE;

		for(int i=0; i<n-1; i++){
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i+1]-minPrice);
		}

		if(maxProfit<0){
			return 0;
		}else{
			return maxProfit;
		}
	}

	public static void main(String args[]){
		int[] prices = {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
}