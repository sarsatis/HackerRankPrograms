package recursion;

public class FibonacciSeries {
	public static void main(String[] args) {
		int n=10;
		int[] memo=new int[n+1];
		int result=printFibo(n,memo);
		System.out.println(result);
	}
	
	

	private static int printFibo(int n, int[] memo) {
		if(n==0 ) {
			return 0;
		}else if(n==1) {
			return 1;
		}else if(memo[n]!=0){
			return memo[n];
		}else {
			memo[n]=printFibo(n-1,memo)+printFibo(n-2,memo);
			return memo[n];
		}
		
	}

}
