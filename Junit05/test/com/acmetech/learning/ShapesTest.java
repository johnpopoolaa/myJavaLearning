// creating the test before implementing the code

package com.acmetech.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	Shapes shape = new Shapes();
	@Test
	void testAreaOfSquare() {
		assertEquals(400, shape.areaOfSquare(20));
	}

	@Test
	void testAreaOfCircle() {
		assertEquals(314, shape.areaOfCircle(10), "Area of circle calculation is wrong."); // we can pass a third parameter to assertEquals to print the error message
	}
}
