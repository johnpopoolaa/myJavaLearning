package com.acmetech.queue;

public class Runner {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enQueue(4);
		q.enQueue(7);
		q.enQueue(5);
		q.enQueue(9);
		
		q.deQueue();
		q.deQueue();
		
		q.enQueue(11);
		q.enQueue(14);
		q.enQueue(23);
		
		System.out.println("Size = " + q.getSize());
		
		q.show();
	}	
}
