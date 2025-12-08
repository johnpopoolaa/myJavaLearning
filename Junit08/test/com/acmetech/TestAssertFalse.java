// exploring assert options -> assertTrue()

package com.acmetech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertFalse {

	@Test
	void test() {
		String str = "Junit5";
		assertFalse(str.length()<5);
	}

}
