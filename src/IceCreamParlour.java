import java.util.Arrays;

public class IceCreamParlour {

	//You want into a ice cream parlour with certain amount of money you have to buy 2 different
	// flours of icecream with all the money you have
	
	//Ice cream Menu
	//Strawberry 2$
	//Blueberry  7$
	//Nutella 	 13$
	//Vanilla 	 5$
	//Banana 	 4$
	//Chocolate  5$
	
	//Given 10$ we can buy Vanilla and Chocolate
	public static void main(String[] args) {
		
		//Given this menu and money as 10 it should return 3 and 5
		int[] menu= {2,7,13,5,4,5};
		int money=10;
		
		int[] result=findChoices(menu,money);
		
		for (int i : result) {
			System.out.print(i+" ");
		}
		
	}

	private static int[] findChoices(int[] menu, int money) {
		
		//creating the clone of actual menu
		int[] sortedMenu=menu.clone();
		//Sorting it the cloned menu
		Arrays.sort(sortedMenu);
		
		//Iterating through the sorted menu
		for(int i=0;i<sortedMenu.length;i++) {
			
			int complement=money-sortedMenu[i];
			int location= Arrays.binarySearch(sortedMenu,i +1,sortedMenu.length,complement);
			
			//We are checking wheather the same complement exists at the returned location
			//because some times if there are no elements found binary element returns random location
			// order of and conditions matters because if element is not found it return -ve values
			//during that time if sortedMenu[location]==complement is at 1st then it will give exception
			if(location>=0 && location<sortedMenu.length && sortedMenu[location]==complement) {
				
				//We get the index for the 1st icecream value i.e sortedMenu[i]
				//We get the index for its complement i.e 2nd icecream value complement
				
				int[] indices=getIndicesFromValues(menu,sortedMenu[i],complement);
				return indices;
			}
		}
		
		return null;
	}

	//In this method we find in the original menu at which index is the actual value
	private static int[] getIndicesFromValues(int[] menu, int value1, int value2) {
		int index1= indexOf(menu,value1,-1);
		int index2=indexOf(menu,value2,index1);
		int [] indices= {Math.min(index1, index2),Math.max(index1, index2)};
		return indices;
	}

	// Here we add excludeThis because in the array we have 5 and 5 repeating so it should not repeate 
	// the same 5's index after finding 1st index
	private static int indexOf(int[] menu, int value,int excludeThis) {
		for(int i=0;i < menu.length;i++) {
			if(menu[i]==value && i!=excludeThis) {
				return i;
			}
		}
		return -1;
	}

}
