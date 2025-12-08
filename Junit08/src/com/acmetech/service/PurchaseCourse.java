// more assertion methods - assertTrue() and assertFalse()

package com.acmetech.service;

import com.learning.dao.Course;

public class PurchaseCourse {
	
	private Course course;
	
	public boolean proceedWithCourse(Course course)
	{
		return course.coursePurchased();
	}
}
