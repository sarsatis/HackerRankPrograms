
class TestClass {
	
	//Problem Statement
	
	//1)Given a String divide the string into two half's
	//2)Concatinate right+left
	//3)Recurse the string and remove identical character in between
	//for e.g cabbaaabcc --> cabbbcc  --> cacc
    public static void main(String args[] ) throws Exception {
    	String name="bbbc";
    
    	//finding the mid point of string
    	final int mid=name.length()/2;
    	
    	//Finding the 1st half & 2nd half of string
    	String[] parts={name.substring(0,mid),name.substring(mid)};
        String left=parts[0];
        String right=parts[1];
        
        String actualString=right+left;
        //cabba aabcc
        System.out.println(getFinalStringRecursive(actualString));
    }

    //Helper function to call recursive function
	private static String getFinalStringRecursive(String actualString) {
		 int mid=actualString.length()/2;
		return getFinalStringRecursive(actualString,mid);
	}

	private static String getFinalStringRecursive(String actualString, int mid) {
		
		if(actualString.length()==0) {
			return "";
		}
		
		//Logic to find if mid char is equal to left and right char if equal recurse by eleminating that
		if(actualString.charAt(mid)==actualString.charAt(mid-1) && actualString.charAt(mid)==actualString.charAt(mid+1)) {
			String[] parts={actualString.substring(0,mid-1),actualString.substring(mid+2)};
	        String left=parts[0];
	        String right=parts[1];
	        actualString=left+right;
	        return getFinalStringRecursive(actualString,actualString.length()/2);
		}else {
			return actualString;
		}
		
		
	}
}
