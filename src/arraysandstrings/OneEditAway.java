package arraysandstrings;

public class OneEditAway {
	
	public static void main(String[] args) {
		
		//Page 60 1.5
		//There are 3 types of edits that can be performed on a string
		//Insert, Remove , Replace
		//Examples
		//1)pale ,ple --> True
		//2)pales,pale --> True
		//3)pale,bale --> True
		//pale,bae --> False
		
		//Tip :- Observe that you dont need to check the string for insertion/removal and replacement
		//The length of the strings will indicate which of these you need to check
		
		String s1="pale";
		String s2="pales";
		
		boolean result=oneEditAway(s1,s2);
		System.out.println(result);
		
	}

	private static boolean oneEditAway(String s1, String s2) {
		//If both the string are equal checking if they are one replace away
		if(s1.length()==s2.length()) {
			return oneEditReplace(s1,s2);
		}
		//In both the else if check the order of the string sent. Lower string length is sent as 1st parameter
		else if(s1.length()+1==s2.length()) {
			return oneEditInsert(s1,s2);
		}else if(s1.length()-1==s2.length()) {
			return oneEditInsert(s2,s1);
		}
		return false;
	}

	

	private static boolean oneEditInsert(String s1, String s2) {
		int index1=0;
		int index2=0;
		
		//Iterating until index < string length
		while(index1<s1.length() && index2<s2.length()) {
			if(s1.charAt(index1)!=s2.charAt(index2)) {
				//We will know its not 1edit away when it enters this loop 2nd time
				if(index1!=index2) {
					return false;
				}
				
				//We will increment only index2 because s2 is the bigger string 
				index2++;
			}else {
				//Incrementing both the index if both the char are equal
				index1++;
				index2++;
			}
		}
		return true;
	}

	private static boolean oneEditReplace(String s1, String s2) {
		boolean found=false;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				//For the second iteration found will be true and will return false
				if(found) {
					return false;
				}
				//1st char is not equal we are setting found is true
				found=true;
			}
		}
		return true;
	}

}
