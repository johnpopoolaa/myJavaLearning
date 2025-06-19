package com.acmetech.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;

class TestingPerformance {

	@Test
	void testSortingMethod_Performance() {
		SortingArray1 array = new SortingArray1();
		
		int unsorted[] = {2,4,5};
		
		assertTimeout(Duration.ofMillis(100), ()-> array.sortingArray(unsorted)); // this tests if the array would be sorted the said number of times under the specified time(in milli seconds)
	}

}
