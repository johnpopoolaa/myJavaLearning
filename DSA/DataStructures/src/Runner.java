public class Runner {
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); // create the new linked list object
		// insert the values using the insert method
		list.insert(14);
		list.insert(36);
		list.insert(43);
		
		list.insertAtStart(22);
		
		list.insertAt(0, 45);
		
		list.deleteAt(2);
		
		list.show(); // show the data in the list using he show method
	}
}
