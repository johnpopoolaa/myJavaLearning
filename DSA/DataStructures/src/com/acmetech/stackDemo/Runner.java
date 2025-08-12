package com.acmetech.stackDemo;

public class Runner
{
	public static void main(String a[])
	{
		DStack nums = new DStack();
		nums.push(4);
		nums.show();
		nums.push(3);
		nums.show();
		nums.push(9);
		nums.show();
		nums.push(7);
		nums.show();
		nums.push(2);
		nums.show();
		
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
		nums.pop();
		nums.show();
	}
}
