package com.acmetech.learning;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class ArraysTesting {

	@Test
	void test() {
		int []expected = {2,4,6,8};
		int []actual = {4,8,6,2};
		
		Arrays.sort(actual);
		
		assertArrayEquals(expected, actual);
	}

}
