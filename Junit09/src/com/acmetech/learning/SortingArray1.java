package com.acmetech.learning;

import java.util.Arrays;

public class SortingArray1 {
	public int[] sortingArray(int[] array)
	{
		for(int i = 0; i < 1000000; i++)
			Arrays.sort(array); // array would be sorted the said number of times
		return array;
	}
}
