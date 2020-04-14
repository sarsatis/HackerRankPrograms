package recursion;

import java.util.Arrays;

//Page 265 8.1
//A chile is running up a staircase with n steps and can hop either 1 ster,2step and 3 step at a time
//Implement a method to count how many possible ways the child can run up the stair
public class TripleSteps {
	public static void main(String[] args) {
		
		int n=3;
		int[] memo=new int[n+1];
		Arrays.fill(memo, -1);
		long result=countWays(n,memo);
		System.out.println(result);
		
	}

	private static int countWays(int n,int[] memo) {
		if(n<0) {
			return 0;
		}else if(n==0) {
			return 1;
		}else if(memo[n] >-1){
			return memo[n];
		}else {
			memo[n]= countWays(n-1,memo)+countWays(n-2,memo)+countWays(n-3,memo);
			return memo[n];
		}
		
		
	}
}
