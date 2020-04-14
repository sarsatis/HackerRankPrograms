package arraysandstrings;

public class URLify {
	//Page 60 1.3 Write a method to replace all the spaces with %20,You may assume that the string has
	//sufficient space at the end to hold the additional characters and that you are given the true length
	//length of the string
	
	//Input :- "Mr John Smith      ", True length=13
	//Output :- "Mr%20John%20Smith"
	
	
	public static void main(String[] args) {
		//Tip :- A common approach in String Manipulation problem is to edit the String starting from the end
		//Algorithm employs a 2scan approach
		//1st scan we count the number of spaces in the string,By tripling this number
		//we can compute how many extra spaces characters we will have in the final string
		//2nd scan we replace the empty space with the %20
		String input="Mr John Smith      ";
		
		//True length is nothing but the actual length of a string without spaces
		int trueLenght=13;
		
		//Removing the trailing spaces and converting it to char array
		char[] charArray=input.trim().toCharArray();
		
		//Calling a method to replace spaces with %20
		char[] output=replaceSpaces(charArray,trueLenght);
		
		//Printing the output
		for (char c : output) {
			System.out.print(c);
		}
		
		
		
	}

	private static char[] replaceSpaces(char[] charArray, int trueLenght) {

		int spaceCount=0,index;
		//Calculating the number spaces in a array
		for(int i=0;i<trueLenght;i++) {
			if(charArray[i]== ' ') {
				spaceCount++;
			}
		}
		
		//Calculating what should be the new array size
		//Since we have to replace single space with 3 characters so actual lenght of new
		//Array will be original length +number of spaces * 3
		index=trueLenght+spaceCount*3;
	
		//Creating a new array of new size
		char[] c=new char[index];
		
		//Iterating the loop in a reverse order and copying the elements, If space found replacing it with%20
		//else replace it with the character
		for(int i=trueLenght-1;i>=0;i--) {
			if(charArray[i]== ' ') {
				c[index-1]='0';
				c[index-2]='2';
				c[index-3]='%';
				index=index-3;
			}else {
				c[index-1]=charArray[i];
				index--;
			}
		}
		return c;
	}

	

}
