package arraysandstrings;

public class StringCompression {

	//Page 60 1.6
	//Input :- aabcccccaaa 
	//Output :- a2b1c5a3
	
	//Return the Output only if the compressed string length is less than the actual String
	public static void main(String[] args) {

		String str="aabbb";
		
		String result=getCompressedString(str);
		System.out.println(result);
	}

	private static String getCompressedString(String str) {
		int count=0;
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<str.length();i++) {
			count++;
			//Checking if the i+1 value is the last value in a string if its a last value the just append and its count
			if(i+1==str.length()) {
				sb.append(str.charAt(i));
				sb.append(count);
			}
			//Checking wheater the current char of i is not equal to next char if its not equal the appending the
			//char and its count after appending count reinitialize it to zero
			else if(str.charAt(i)!=str.charAt(i+1)) {
				sb.append(str.charAt(i));
				sb.append(count);
				count=0;
			}
		}
		return sb.length() > str.length()?str:sb.toString();
	}

}
