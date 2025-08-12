package com.acmetech.queue;

public class Queue {
	int queue[] = new int[5]; // create the queue and set the size
	// initialize all the parameters to work with the queue
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) // create the enQueue method to add data to the queue
	{
		if(!isFull()) // check if the queue is full
		{
			// run normally if not full
			queue[rear] = data;
			rear = (rear + 1) % 5;
			size = size + 1;
		}
		else // if the queue is empty
			System.out.println("Queue is full"); // stop the data to be added to the queue if it is full
	}
	
	public int deQueue() // create the deQueue method to remove data from the queue
	{
		int data = queue[front]; // make the front element to be the major element to work with
		if(!isEmpty()) // check if the queue is empty
		{
			// run code normally if not
			front = (front + 1) % 5;
			size = size - 1;
		}
		else // if the queue is empty
			System.out.println("Queue is empty"); // stop data from being removed from the queue
		return data; // integer to be returned
	}
	
	public void show() // show method to display the elements from the queue
	{
		System.out.print("Elements : ");
		for(int i = 0; i < size; i++)
		{
			System.out.print(queue[(front + i) % 5] + " ");
		}
		System.out.println();
		for(int n : queue)
		{
			System.out.print(n + " ");
		}
	}
	
	public int getSize() // create the getSize method to get the size of the queue
	{
		return size; // return the size
	}
	
	public boolean isEmpty() // create the method to check if the queue is empty
	{
		return getSize() == 0; // return true if empty and false if not empty
	}
	
	public boolean isFull() // create a method to check if the queue is full
	{
		return getSize() == 5; // return true if full and false if not full
	}
}
