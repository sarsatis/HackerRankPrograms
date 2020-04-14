
public class FibonacciRecursive {
	
	//fibonacci number is nothing but sum of previous 2 number's
	
	static int n1=0;
	static int n2=1;
	static int n3=0;

	public static void main(String[] args) {

		//Prints Fibo number
		int n=3;
		int fiboNumber=fib(n);
		System.out.println(fiboNumber);
		
		//Prints fibo series
		
		int m=5;
		System.out.print(n1+" "+n2);
		
		//m-2 because already 2 numbers are printed above
		fibonacciSeries(m-2);
		
		
		
		
	}
	private static void fibonacciSeries(int i) {
		
		if(i>0) {
			//adding of previous 2 numbers
			n3=n1+n2;
			
			//swapping of numbers
			n1 = n2;    
	        n2 = n3;    
	        System.out.print(" "+n3);   
	        fibonacciSeries(i-1);  
		}
	}

	private static int fib(int n) {
		
		// n==0 and n==1 are the base cases where recursion will terminate
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 1;
		}else {
			//it computes the fibo number
			return fib(n-1)+fib(n-2);
		}
	}

}
