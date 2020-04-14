

public class BinarySearch {
	
	
	private static boolean binarySearchIterative(int[] array, int number) {
		
		int left=0;
		int right=array.length;
		
		while(left<=right) {
			int mid=left+((right-left)/2);
			
			//check if the number is the mid number
			if(array[mid]==number) {
				return true;
			}
			//Check if the number is lesser or greater since its lesser so mid-1
			else if(number<array[mid]) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return false;
	}
	
	
	
	//helper method to call binary tree which passes left index and right index
	public static boolean binarySearchRecursive(int[] array,int number) {
		//right index should always be -1
		return binarySearchRecursive(array,number,0,array.length-1);
		
	}

	
	private static boolean binarySearchRecursive(int[] array, int number, int left, int right) {
		//Initial Check to find weather left is bigger than right
		if(left>right) {
			return false;
		}
		
		//Calculate mid point we can use left+right/2 also
		//below is used just to avoid integer index out of bound
		int mid=left+((right-left)/2);
		
		//check if the number is the mid number
		if(array[mid]==number) {
			return true;
		}
		//Check if the number is lesser or greater since its lesser so mid-1
		else if(number<array[mid]) {
			return binarySearchRecursive(array,number,left, mid-1); 
		}else {
			return binarySearchRecursive(array,number,mid+1,right); 
		}
	}

	public static void main(String[] args) {

		int[] array= {1,2,3,4,5,6,7,8,9};
		int number=9;
		//System.out.println(binarySearchRecursive(array, number));
		System.out.println(binarySearchIterative(array,number));
	}

}
