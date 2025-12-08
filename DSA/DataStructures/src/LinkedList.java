public class LinkedList {
	Node head; // create the first data in the linked list - head
	
	// create and implement the insert method
	public void insert(int data) // insert takes an argument - data
	{
		Node node = new Node(); // create a new node object
		node.data= data;
		node.next = null;
		
		// check if there is no existing head
		if(head == null)
		{
			head = node; // make the node(the current node becomes the head)
		}
		// if there is an existing head
		else
		{
			Node n = head; // make head be node n
			// keep running as long as the next node is not empty
			while(n.next != null)
			{
				n = n.next; // increment n
			}
			n.next = node; // increment the n.next to node
		}
	}
	
	// create method to insert at the start of the linked list
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data= data;
		node.next = null;
		node.next = head;
		head = node;
	}
	
	// create method to insert at any point in the linked list
	public void insertAt(int index, int data)
	{
		Node node = new Node(); // create a new node object
		node.data= data;
		node.next = null;
		
		if(index == 0) // check if the index is 0, i.e the data is to be the first in the linked list
		{
			insertAtStart(data); // call the insert at start method and pass data to it
		}
		else // run -> if the index is not the first
		{
			Node n = head;
			for(int i = 0; i < index-1; i++) // loop to go through all the elements in the linked list
			{
				n = n.next; // traverse by making n equal to n.next
			}
			// note that n is the first element in the list while node is the second. n.next is the address of the next element to n and node.next is the address to the next element to node
			node.next = n.next; // make the address of the element to be updated(that was in 'n.next') to be stored in the space of the element replacing it(node.next)...
			n.next = node; // make the node of the new element to be the address stored in the element before it
		}
	}
	
	// implement delete method to delete a value at a particular index
	public void deleteAt(int index)
	{
		if(index == 0) // check if the element to be deleted is the first element
		{
			head = head.next; // if we are deleting the first element, update the head to be the next element
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i = 0; i < index - 1; i++)
			{
				n = n.next; // go through each element in the linked list till you get to the element before the one to be deleted
			}
			n1 = n.next; // identify n1, the element to be deleted
			n.next = n1.next; // update the element after n to be the one after n1
			n1 = null; // remove n1 from the list completely
		}
	}
	
	// create and implement show method
	public void show()
	{
		Node node = head; // initialize the node with the head
		// keep running as long as the next node is not empty
		while(node.next != null)
		{
			System.out.println(node.data); // print the data at the node location
			node = node.next; // increment node
		}
		System.out.println(node.data); // print the last element in the list because the conditional above wouldn't get to print the last element as the data in it is empty
	}
}
