package com.acmetech.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestException {

	@Test
	void testSortingArrayException() {
//		try
//		{
			SortingArray array = new SortingArray(); // create new object
//			int unsorted[] = null; // create a new array
//			int sortedArray[] = array.sortingArray(unsorted); // assign and perform sorting operation on the new array
//			// exception would be recorded because you can't sort a "null" array
//			for(int e:sortedArray) // enhanced for loop
//			{
//				System.out.println(e);
//			}
//		}
//		catch(NullPointerException e) // catch the exception if one is recorded
//		{
//			System.out.println("Exception encountered");
//			// this test would still pass because the test runs completely except we fail it explicitly
//		}
			
			int unsorted[] = null;
			assertThrows(NullPointerException.class, ()-> array.sortingArray(unsorted));
			// this would only pass if the array is "null" because the test is checking to see if the exception is thrown.
	}

}