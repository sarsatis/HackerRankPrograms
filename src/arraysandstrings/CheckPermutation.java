package arraysandstrings;

public class CheckPermutation {

	//Page 60 Question 1.2
	//To check wheather two string are permutation of each other
	//Two string are permutation to each other of both the string length match and alphabet 
	//occurances are same
	public static void main(String[] args) {

		String str1="sar";
		String str2="rass";
		boolean isPermutation=checkPermutation(str1,str2);
		String result=isPermutation?"Yes":"No";
		System.out.println(result);
	}

	private static boolean checkPermutation(String str1, String str2) {
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		
		int[] a=new int[26];
		
		//Converting the character to its respective integer value and incrementing 
		//its respective position in array
		for(char c:c1) {
			int charIntValue=(int)c-96;
			a[charIntValue]++;
			
		}
		
		//Iterating through second string array and decrementing the array
		//if there is a negative value in a array then both the string are not equal
		for(int i=0;i<c2.length;i++) {
			int charIntValue=(int)c2[i]-96;
			a[charIntValue]--;
			if(a[charIntValue]<0) {
				return false;
			}
		}
		return true;
	}

}
