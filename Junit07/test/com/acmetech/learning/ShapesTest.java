// using assertNotEquals - opposite working process of assertEquals

package com.acmetech.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calcTest {
	Shapes shape = new Shapes();

	@Test
	void testSquareArea() {
		assertNotEquals(80, shape.areaOfSquare(10));
	}
	
	@Test
	void testSquareArea_Default() {
		assertNotEquals(81, shape.areaOfSquare(9), ()->"developer to read this message");
	}
	
	@Test
	void testSquareArea_Supplier() {
		assertNotEquals(100, shape.areaOfSquare(10), ()->"message to pass to developer");
	}

}
