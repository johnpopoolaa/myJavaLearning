package com.acmetech.stackDemo;

public class DStack
{
	int capacity = 2; // initialize the capacity of the stack
	int stack[] = new int[capacity]; // create the stack itself
	int top = 0;
		
	public void push(int data)
	{
		if(size() == capacity) // check if the stack is full
			expand(); // expand the stack if it is full
		stack[top] = data;
		top++;
	}
		
	// implementation of the expand method
	private void expand() {
		int length = size();
		int newStack[] = new int[capacity*2]; // create a new stack and make it to be double the stack
		System.arraycopy(stack, 0, newStack, 0, length); // specify the copying details
		stack = newStack; // make stack retain the newStack
		capacity *= 2; // update the capacity value
	}

	public int pop()
	{
		int data = 0;
		if(isEmpty())
		{
			System.out.println("Cannot delete from empty stack");
		}
		else
		{
			top--;
			data = stack[top];
			stack[top] = 0;
			shrink();
		}
		return data;
	}
		
	private void shrink() {
		int length = size();
		if(length<=(capacity/2)/2)
			capacity = capacity/2;
		
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
	}

	public int peek()
	{
		int data;
		data = stack[top-1];
		return data;
	}
		
	public int size()
	{
		return top;
	}
		
	public boolean isEmpty()
	{
		return top<=0;
	}
		
	public void show()
	{
		for(int n : stack)
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
}