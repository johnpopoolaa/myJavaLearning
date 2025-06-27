package com.acmetech.learning;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBeforeAllAfterAll {
	TestBeforeAllAfterAll() {
		System.out.println("Test object created before test method");
	}
	
	@BeforeAll // annotation to run the method before every other method. it is only run once
	void beforeAll() { // this is run before any other thing is done(even object creation) because it is a static method
		System.out.println("Before all test");
	}
	
	@AfterAll // annotation to run the method after every other method. it is only run once
	void afterAll() {
		System.out.println("After all test");
	}
	
	Shapes shape;
	
	@BeforeEach
	void init() {
		shape = new Shapes();
		System.out.println("Before test");
	}

	@Test
	void testComputeSquareArea() {
		assertEquals(81, shape.computeSquareArea(9));
		System.out.println("Actual test running");
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5));
		System.out.println("Actual test running");
	}
	
	@AfterEach
	void destroy() {
		System.out.println("After test");
	}
}
