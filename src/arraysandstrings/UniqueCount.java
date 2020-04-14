package arraysandstrings;

public class UniqueCount {

	//Page 60 Question 1.1
	//To check if all the characters are unique in string
	public static void main(String[] args) {

		String str="sarthak";
		boolean unique=isUnique(str);
		String result=unique?"Unique":"Not Unique";
		System.out.println(result);
		
	}

	private static boolean isUnique(String str) {
		
		char[] charArray=str.toCharArray();
		
		int[] alphabetCount=new int[26];
		
		for (char c : charArray) {
			//Converting character value to its respective integer value
			int a=(int)c-96;
			//Incrementing the array at respective alphabet position
			alphabetCount[a]++;
			//Returning false if index value at a specfic position is greater than 1
			if(alphabetCount[a]>1) {
				return false;
			}
			
		}
		return true;
	}

}
