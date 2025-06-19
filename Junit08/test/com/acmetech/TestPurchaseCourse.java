// understanding assertTrue with a course sale project

package com.acmetech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.acmetech.service.PurchaseCourse;
import com.learning.dao.JavaCourse;

class TestPurchaseCourse {

	@Test
	void testProceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse(); // create object of PurchaseCourse
		boolean status = pc.proceedWithCourse(new JavaCourse()); // JavaCourse's object of type Course is passed to proceedWithCourse of type Course and as a result "true" being returned by JavaCourse, we can assign the value to a boolean->"status"
		assertTrue(status);
	}

}
