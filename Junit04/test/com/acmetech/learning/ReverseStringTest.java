// writing code to use multiple tests from the same class

package com.acmetech.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseStringTest {
	ReverseString reverse = new ReverseString();
	@Test
	void testReverseSingleString() {
		assertEquals("avaJ", reverse.reverseString("Java"));
	}
	
	@Test
	void testReverseMultipleString() {
		assertEquals("gniK si avaJ", reverse.reverseString("Java is King"));
	}

}
