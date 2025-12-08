// trial test code - test-driven development
// running maven test without using junit and supplier interface to pass error message
// using supplier interface to pass error is a preferable method to pass messages because it is only considered if the test fails

package com.acmetech.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTrial {

	@Test
	void test() {
		assertEquals(6, 6);
	}

	@Test
	void testAreaOfSquare_Supplier() {
		Shapes shape = new Shapes();
		assertEquals(576, shape.areaOfSquare(24), ()->"the area of the square is incorrect"); // using supplier interface
	}
}
