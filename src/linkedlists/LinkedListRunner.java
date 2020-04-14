package linkedlists;

public class LinkedListRunner {
	//Execution class where we call operations of custom implemented linked list
	public static void main(String[] args) {

		LinkedListCustomImpl ll=new LinkedListCustomImpl();
		ll.insert(5);
		ll.insert(2);
		ll.insert(26);
		ll.insert(26);
		ll.insert(1);
		ll.insert(3);
		
		ll.insertAtStart(6);
		
		ll.insertAtIndex(0, 26);
		
		ll.deleteAt(2);
		
		
		ll.show();
		
		
		
		
		
	}

}
