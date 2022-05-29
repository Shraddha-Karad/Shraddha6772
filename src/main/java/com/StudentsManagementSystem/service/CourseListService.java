package com.StudentsManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.StudentsManagementSystem.entity.CourseList;


@Service
public interface CourseListService {


	  List<CourseList> getAllCourseList();
	  
	  CourseList saveCourse(CourseList courseList);
	  
	  CourseList getCourseById(int courseId);
	
	  
	  CourseList updateCourse(CourseList courseList);
	  
	  void deleteCourseById(int courseId);
	 
}