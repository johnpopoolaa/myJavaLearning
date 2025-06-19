// understanding assertFalse() with a course sale project

package com.acmetech;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.acmetech.service.PurchaseCourse;
import com.learning.dao.JavaCourse1;

class TestPurchaseCourse1 {

	@Test
	void testProceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse(); // create object of PurchaseCourse
		boolean status = pc.proceedWithCourse(new JavaCourse1()); // JavaCourse's object of type Course is passed to proceedWithCourse of type Course and as a result "true" being returned by JavaCourse, we can assign the value to a boolean->"status"
		assertFalse(status);
	}

}
