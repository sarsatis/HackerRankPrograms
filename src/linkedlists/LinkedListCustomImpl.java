package linkedlists;

import java.util.HashSet;

public class LinkedListCustomImpl {
	//Initializing Node
	Node head;
	
	//Insert method of linked list
	public void insert(int data) {
		//Creating a node object
		Node node=new Node();
		//Storing the data
		node.data=data;
		//Initially setting the address to null
		node.nextAddress=null;
		
		
		//So if Head is null the the current value which we are inserting is the head node.
		//so we store head=node(current value)
		if(head==null) {
			head=node;
		}
		
		//Else part where data entered is not the 1st element
		else {
			//To the node object we take head and traverse through it until we get null as next address
			Node n=head;
			while(n.nextAddress!=null) {
				//To jump to the next address if address of current node is not null
				n=n.nextAddress;
			}
			//When it comes out of while loop which means its at the last node and we add the data
			n.nextAddress=node;
		}
	}
	
	public void show() {
		
		//To traverse we start from head node
		Node n=head;
		//we traverse until next address is not null
		while(n.nextAddress!=null) {
			System.out.println(n.data);
			//Jumping to next node
			n=n.nextAddress;
		}
		
		//Last syso to print the last null address data
		System.out.println(n.data);
	}
	
	
	//Inserting data at the start
	public void insertAtStart(int data) {
		
		//Creating a node object
		Node node=new Node();
		//Assigning the data to data field
		node.data=data;
		//Since current node will be head node we are assigning its address to head address
		node.nextAddress=head;
		//we are also making head as current node
		head=node;
	}
	
	public void insertAtIndex(int index,int data) {
		
		Node node=new Node();
		node.data=data;
		node.nextAddress=null;
		//So if index is 0 then we are inserting data at 1st place so we directly call start method
		if(index==0) {
			insertAtStart(data);
		}else {
			//Initialize head node
			Node n=head;
			//Traverse until index
			for(int i=0;i<index-1;i++) {
				n=n.nextAddress;
			}
			//Swapping the address of current node and next node
			node.nextAddress=n.nextAddress;
			n.nextAddress=node;
		}
		
	}
	
	public void deleteAt(int index) {
		
		//If index is 0 then we point head to next address
		if(index==0) {
			head=head.nextAddress;
		}else {
			
			Node n=head;
			Node n1=null;
			//We traverse until that index
			for(int i=0;i<index-1;i++) {
				n=n.nextAddress;
			}
			//Swapping the address of the next address using temp variable
			n1=n.nextAddress;
			n.nextAddress=n1.nextAddress;
		}
	}
	

}
