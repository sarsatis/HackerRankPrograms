package arraysandstrings;

public class PalindromePermutation {

	//Page 60 1.4
	//Given a string write a function to check if it is a permutation of a palindrome.
	//A palindrome is a word or phrase that is the same forwards and backwards
	//A permutation is a rearrangement of letters
	//Input :- Tact Coa
	//Output :- True (permutations : "taco cat","atco cta", etc.)
	public static void main(String[] args) {
		//Notes :- What does it take to be able to write a set of characters the same way forward and backwards?
		//We need to have even number of almost all the characters so that half can be on one side and half
		//can be on the other side.At most 1 character in the middle can have odd count
		
		//For example we know tactcoapapa is a permutation of a palindrome because it has
		// 2 T's ,4 A's, 2 C's, 2 P's and 1 O 
		
		//Input String
		String input="Tact Coa ";
		
		//Removing all the whitespaces from string and making it to lower
		String replacedLowerString=input.replaceAll("\\s", "").toLowerCase();
		
		//Checking how many times a character occurs
		int[] table=buildFrequencyCharTable(replacedLowerString);
		
		//To check only one odd character occurs
		boolean isPermute=checkMaxOneOdd(table);
		
		System.out.println(isPermute);
		
		

		
	}

	

	
	private static boolean checkMaxOneOdd(int[] table) {
		//Initializing with false
		boolean found=false;
		for (int count : table) {
			//count % 2 will return 0 for even numbers and 1 for odd numbers
			//It should have only one odd number so 1st time we are making false =true and when it enters
			//2nd time we are returning false directly
			if(count%2==1) {
				if(found) {
					return false;
				}
				found=true;
			}
		}
		return true;
	}




	private static int[] buildFrequencyCharTable(String replacedLowerString) {
		//Creating a array of size 26 because there are 26albhabet
		//New way to find what is the character number of a or z
		// i.e Character.getNumbericValue('a') --> a=10 it starts from 10
		int[] frequency=new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		for(char c:replacedLowerString.toCharArray()) {
			//Iterating throught the char array and finding what is the numberic value of character
			//Subtracting by a because a only start from 10 so what ever numberic value we get will be addition of 10
			int i=Character.getNumericValue(c)-Character.getNumericValue('a');
			//Incrementing at respective place
			frequency[i]++;
		}
		//returning the frequencies of occurance
		return frequency;
	}

}
