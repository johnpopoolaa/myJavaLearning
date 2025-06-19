package com.learning.dao;

public class JavaCourse1 implements Course {
	@Override
	public boolean coursePurchased()
	{
		System.out.println("It's not actually connecting to db hance false being returned");
		return false;
	}
}
